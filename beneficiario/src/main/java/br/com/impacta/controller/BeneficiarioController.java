package br.com.impacta.controller;

import java.util.Date;
import java.util.List;
import br.com.impacta.model.Beneficiario;
import br.com.impacta.repository.BeneficiarioRepository;

import br.com.impacta.servicos.BeneficiarioServicos;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name="Beneficiario endpoint")
@RestController
@RequestMapping("Beneficiario")

public class BeneficiarioController {
	
	@Autowired
	private BeneficiarioRepository repository;
	
	@Operation(summary="Para criar Beneficiario basta informar idcomp,idusu,obs "
			  )
	@PostMapping("/criaBeneficiario/{nomeBeneficiario}/{Obs}/{Idcamp}/{Idusu}/{email}/{tipo}")	
	public Beneficiario criaBeneficiario(@PathVariable("nomeBeneficiario") String nomeBeneficiario,
			@PathVariable("Obs") String obs,
			@PathVariable("Idcamp") int idCamp,
			@PathVariable("Idusu") int idUsu,
			@PathVariable("tipo") String tipo) {
		
	 var dt =  new Date();
	 SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	 Date result = null;
	 result  = format.parse(dtEvento);
	 Beneficiario col = new Beneficiario();
		col.setNomeBeneficiario(nomeBeneficiario);
		col.setObs(obs);
		col.setIdcamp(idCamp);
		col.setIdusu(idUsu);
		col.setDelet(" ");
		col.setDtcad(dt);
		
		try {
		var ret = repository.save(col);
		
		return ret;
		}catch (Exception e) {
			var a =e.getMessage();
			var r=a;

			col.setObs(a);
			return col;
		}
	}
	

	@Operation(summary="Para pesquisar toso os Beneficiarios")
	@GetMapping("/PesquisarAllBeneficiarios/")	
	public List<Beneficiario> pesquisarAllBeneficiarios(){		
		BeneficiarioServicos s =new BeneficiarioServicos(repository);
		
			
		try {
			
		var ret = s.pesqALl();
		
		return ret;
		}catch (Exception e) {
			var a =e.getMessage();
			var r=a;
			List<Beneficiario> col = new ArrayList<Beneficiario>();
			return col;
			
		}
		
		
		
	}
	
	@Operation(summary="Para pesquisar Beneficiario por ID")
	@GetMapping("/PesquisarByIDBeneficiario/{ID}")	
	public Beneficiario PesquisarByIDBeneficiario(
			@PathVariable("ID") Long id){		
		BeneficiarioServicos s =new BeneficiarioServicos(repository);
		
			
		try {
			
		var ret = s.pesqPorId(id);
		
		return ret;
		}catch (Exception e) {
			var a =e.getMessage();
			var r=a;
			Beneficiario catServ = new Beneficiario();
			col.setNomeBeneficiario("Não encontrou Beneficiario por ID");
			return col;
			
		}
		
		
		
	}
	
	
	@Operation(summary="Para pesquisar Todos Beneficiarios")
	@GetMapping("/PesquisarByUsuario/{IdUsu}")	
	public List<Beneficiario> PesquisarByUsuario(
			@PathVariable("IdUsu") int id){		
		BeneficiarioServicos s =new BeneficiarioServicos(repository);
		
			
		try {
			
		var ret = s.pesqPorUsuario(id);
		
		return ret;
		}catch (Exception e) {
			var a =e.getMessage();
			var r=a;
			List<Beneficiario> col = new ArrayList<Beneficiario>();
			return col;
			
		}
		
		
		
	}
	
}
	
	
	
//	  @Operation(summary="Para criar Beneficiario basta informar idcomp,idusu,obs "
//	  )
//	  
//	  @PostMapping("/cria_Beneficiario") public Beneficiario
//	 criaColaboracao(@RequestBody Beneficiario col) { BeneficiarioServicos serv =
//	  new BeneficiarioServicos(repository);
//	  
//	  try { var ret= serv.criaBeneficiario(col.getIdcamp(), col.getIdusu(),
//	  col.getObs());
//	  
//	  return col; }catch (Exception e) {
//	  
//	  col.setObs(e.getMessage()); return col; }
//	  }



