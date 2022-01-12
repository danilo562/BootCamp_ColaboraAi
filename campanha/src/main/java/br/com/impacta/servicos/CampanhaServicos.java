package br.com.impacta.servicos;
import java.util.Date;
import java.util.List;

import br.com.impacta.repository.CampanhaRepository;
import br.com.impacta.model.Campanha;


public class CampanhaServicos {
	private CampanhaRepository repository;

	public CampanhaServicos(CampanhaRepository repository) {
		super();
		this.repository = repository;
	}
	
	public Campanha criaCampanha(String nomeCamp,String descricao,String nomeResponsavel,
			Long idCategoria,String email,String telefone,String site,
			String local,Date dtEvento,int idusu) {
		
		var dt =  new Date();
		Campanha cap =new Campanha();
		cap.setNomeCamp(nomeCamp);
		cap.setDescricao(descricao);
		cap.setNomeResponsavel(nomeResponsavel);
		cap.setIdCategoria(idCategoria);
		cap.setEmail(email);
		cap.setTelefone(telefone);
		cap.setSite(site);
		cap.setLocal(local);
		cap.setDtEvento(dtEvento);
		cap.setIdusu(idusu);
		cap.setDtcad(dt);
		cap.setDelet(" ");
		
		
		 try {
				var NovoUsuario =repository.save(cap);
				return NovoUsuario;
				}catch (Exception e) {
			       
					var a =e.getMessage();
					var r=a;

					cap.setDescricao(a);
					return cap;
				}
		
	}
	
public List<Campanha> pesqALl() {
	var ret = repository.findAll();
	return ret;
}

public Campanha pesqPorId(Long id) {
	var ret = repository.findById(id).orElseThrow();
	return ret;
}

public List<Campanha> pesqPorUsuario(int id) {
	var ret = repository.findByIdusu(id);
	return ret;
}

}
