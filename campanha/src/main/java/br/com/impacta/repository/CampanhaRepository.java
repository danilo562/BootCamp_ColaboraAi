package br.com.impacta.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.impacta.model.Campanha;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface CampanhaRepository extends JpaRepository<Campanha, Long> {
	
	//@Query("SELECT idusu FROM projeto.campanha where idusu = ?1")
	List<Campanha> findByIdusu(int idusu);
	
		

}
