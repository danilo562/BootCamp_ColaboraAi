package br.com.impacta.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.impacta.model.Email;
import br.com.impacta.model.Usuario;

public interface EmailRepository extends JpaRepository<Email, Long> {
	

	
	 
	
}
