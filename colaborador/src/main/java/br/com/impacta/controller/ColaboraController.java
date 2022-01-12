package br.com.impacta.controller;

import java.util.Date;
import java.util.List;


import br.com.impacta.model.Colabora;
import br.com.impacta.repository.ColaboraRepository;
import br.com.impacta.servicos.ColaboraServicos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name="Colabora endpoint")
@RestController
@RequestMapping("Colabora")

public class ColaboraController {
	
	@Autowired
	private ColaboraRepository repository;
	
	@Operation(summary="Para criar Colaboraçao basta informar idcomp,idusu,obs ")
	
	@PostMapping("/cria_Colabora/{nomeBeneficiario}/{Obs}/{Idcamp}/{Idusu}/{email}/{tipo}")	
	public Colabora criaColaboracao(@PathVariable("nomeBeneficiario") String nomeBeneficiario,
			@PathVariable("Obs") String obs,
			@PathVariable("Idcamp") int idCamp,
			@PathVariable("Idusu") int idUsu,
			@PathVariable("email") String email,
			@PathVariable("tipo") String tipo) {
		
	 var dt =  new Date();
	 Colabora col = new Colabora();
		col.setNomeBeneficiario(nomeBeneficiario);
		col.setObs(obs);
		col.setIdcamp(idCamp);
		col.setIdusu(idUsu);
		col.setEmail(email);
		col.setTipo(tipo);
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
	
	
	
	
	
	
	
	
	/*@PostMapping("/cria_Colabora")
	public Colabora criaColaboracao(@RequestBody Colabora col) {
		ColaboraServicos serv = new ColaboraServicos(repository);
		
		try {
			var ret= serv.criaColaboracao(col.getIdcamp(), col.getIdusu(), col.getObs());
					
				return col;
				}catch (Exception e) {
					
					col.setObs(e.getMessage());
					return col;
				}
		
		
		
	}*/
	
	

}
