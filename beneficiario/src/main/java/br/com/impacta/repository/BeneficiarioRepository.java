package br.com.impacta.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.impacta.model.Beneficiario;


public interface BeneficiarioRepository extends JpaRepository<Beneficiario, Long> {

	List<Beneficiario> findByIdusu(int idusu);
}
