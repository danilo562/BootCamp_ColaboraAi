package br.com.impacta.controller;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.impacta.repository.CampanhaRepository;
import br.com.impacta.servicos.CampanhaServicos;
import br.com.impacta.model.Campanha;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name="Campanha endpoint")
@RestController
@RequestMapping("Campanha")
public class CampanhaController {
	@Autowired
	private CampanhaRepository repository;
	
	
	@Operation(summary="Para criar campanha")
	@PostMapping("/cria_Campanha/{nomeCampanha}/{descricaoCampanha}/{nomeResponsavel}/{categoria}/{email}/{telefone}"
			+ "/{local}/{dtEvento}/{horaEvento}/{idUsu}")	
	public Campanha criaCategoriaCampanha(
			@PathVariable("nomeCampanha") String nomeCampanha,
			@PathVariable("descricaoCampanha") String descricaoCampanha,
			@PathVariable("nomeResponsavel") String nomeResponsavel,
			@PathVariable("categoria") String categoria,
			@PathVariable("email") String email,
			@PathVariable("telefone") String telefone,
			@PathVariable("local") String local,
			@PathVariable("dtEvento") String dtEvento,
			@PathVariable("horaEvento") String horaEvento,
			@PathVariable("idUsu") int idUsu) throws ParseException{		
		
	 var dt =  new Date();
	 SimpleDateFormat formatData = new SimpleDateFormat("yyyy-MM-dd");
	 
	 
	
	 Date resultData  = formatData.parse(dtEvento);
	 
	 
	 Campanha catServ = new Campanha();
	 catServ.setNomecamp(nomeCampanha);
	 catServ.setDescricao(descricaoCampanha);
	 catServ.setNomeresponsavel(nomeResponsavel);
	 catServ.setEmail(email);
	 catServ.setTelefone(telefone);
	 catServ.setSite(" ");
	 catServ.setLocal(local);
	 catServ.setDtevento(resultData);
	 catServ.setHoraevento(horaEvento);
	 catServ.setIdusu(idUsu);
	 catServ.setDelet(" ");
	 catServ.setDtcad(dt);
	 
		
		try {
		var ret = repository.save(catServ);
		
		return ret;
		}catch (Exception e) {
			var a =e.getMessage();
			var r=a;

			catServ.setDescricao(a);
			return catServ;
		}
		
		
		
	}
	
	
	@Operation(summary="Para pesquisar Todas Campanhas")
	@GetMapping("/PesquisarAllCampanha/")	
	public List<Campanha> pesquisarAllCampanha(){		
		CampanhaServicos s =new CampanhaServicos(repository);
		
			
		try {
			
		var ret = s.pesqALl();
		
		return ret;
		}catch (Exception e) {
			var a =e.getMessage();
			var r=a;
			List<Campanha> catServ = new ArrayList<Campanha>();
			return catServ;
			
		}
		
		
		
	}
	
	@Operation(summary="Para pesquisar Campanha por ID")
	@GetMapping("/PesquisarByIDCampanha/{ID}")	
	public Campanha PesquisarByIDCampanha(
			@PathVariable("ID") Long id){		
		CampanhaServicos s =new CampanhaServicos(repository);
		
			
		try {
			
		var ret = s.pesqPorId(id);
		
		return ret;
		}catch (Exception e) {
			var a =e.getMessage();
			var r=a;
		Campanha catServ = new Campanha();
		catServ.setNomecamp("Não encontrou campanha por ID");
			return catServ;
			
		}
		
		
		
	}
	
	
	@Operation(summary="Para pesquisar Todas Campanhas")
	@GetMapping("/PesquisarByUsuario/{IdUsu}")	
	public List<Campanha> PesquisarByUsuario(
			@PathVariable("IdUsu") int id){		
		CampanhaServicos s =new CampanhaServicos(repository);
		
			
		try {
			
		var ret = s.pesqPorUsuario(id);
		
		return ret;
		}catch (Exception e) {
			var a =e.getMessage();
			var r=a;
			List<Campanha> catServ = new ArrayList<Campanha>();
			return catServ;
			
		}
		
		
		
	}
	
	
	/*
	 * @Operation(summary="Para criar campanha")
	 * 
	 * @PostMapping("/cria_Campanha") public Campanha
	 * criaCategoriaCampanha(@RequestBody Campanha camp) {
	 * 
	 * CampanhaServicos catServ = new CampanhaServicos(repository); try {
	 * 
	 *  
	 * var ret=
	 * catServ.criaCampanha(camp.getNomeCamp(),camp.getDescricao(),camp.
	 * getNomeResponsavel(),
	 * camp.getIdCategoria(),camp.getEmail(),camp.getTelefone(),camp.getSite(),
	 * camp.getLocal(),camp.getDtEvento(),camp.getIdusu()) ;
	 * 
	 * return camp; }catch (Exception e) {
	 * 
	 * camp.setDescricao(e.getMessage()); return camp; }
	 * 
	 * }
	 */

		

}
