package br.com.impacta.servicos;

import java.util.Date;
import java.util.List;
import br.com.impacta.model.Beneficiario;

import br.com.impacta.repository.BeneficiarioRepository;

public class BeneficiarioServicos {

	private BeneficiarioRepository repository;

	public BeneficiarioServicos(BeneficiarioRepository repository) {
		super();
		this.repository = repository;
	}
	
	public Beneficiario criaBeneficiario(int idcamp,int idusu,String obs) {
		var dt =  new Date();
		Beneficiario col = new Beneficiario();
		col.setIdcamp(idcamp);
		col.setIdusu(idusu);
		col.setObs(obs);
		col.setDtcad(dt);
		col.setDelet(" ");
		
		 try {
				var NovoColabora =repository.save(col);
				return NovoColabora;
				}catch (Exception e) {
			       
					var a =e.getMessage();
					
					col.setObs(a);
					return col;
				}
		
		
	}
	
	public List<Beneficiario> pesqALl() {
		var ret = repository.findAll();
		return ret;
	}

	public Beneficiario pesqPorId(Long id) {
		var ret = repository.findById(id).orElseThrow();
		return ret;
	}

	public List<Beneficiario> pesqPorUsuario(int id) {
		var ret = repository.findByIdusu(id);
		return ret;
	}
	
	
	
	
}
