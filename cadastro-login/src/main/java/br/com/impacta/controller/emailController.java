package br.com.impacta.controller;
import br.com.impacta.model.Email;
import br.com.impacta.repository.EmailRepository;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name="usuario endpoint")
@RestController
@RequestMapping("email")
public class emailController {
	
	@Autowired
	private EmailRepository repository;
	

	
@PostMapping("/cadastra_email/{email}")	
public Email cadatrarEmail(
		@PathVariable("email") String email) {
		
	
 
	Email em = new Email();
	
	em.setEmail(email);
	
	
	try {
	var ret = repository.save(em);
	
	return ret;
	}catch (Exception e) {
		var a =e.getMessage();
		

		em.setEmail(a);
		return em;
	}
}

}
	

	




