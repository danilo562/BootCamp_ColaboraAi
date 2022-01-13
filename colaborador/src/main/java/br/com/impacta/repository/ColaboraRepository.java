package br.com.impacta.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import br.com.impacta.model.Colabora;

public interface ColaboraRepository extends JpaRepository<Colabora, Long> {

	List<Colabora> findByIdusu(int idusu);
}
