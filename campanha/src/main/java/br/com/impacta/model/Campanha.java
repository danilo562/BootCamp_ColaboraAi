package br.com.impacta.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="campanha")

public class Campanha implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idcampanha;
	
	@Column(nullable = true)
	private String nomecamp;
	
	@Column(nullable = true)
	private String descricao;
	
	@Column(nullable = true)
	private String nomeresponsavel;
	
	@Column(nullable = true)
	private Long idcategoria;
	
	@Column(nullable = true)
	private String email;
	
	@Column(nullable = true)
	private String telefone;
	
	@Column(nullable = true)
	private String site;
	
	@Column(nullable = true)
	private String local;
	
	@Column(nullable = true)
	private Date dtevento;
	
	@Column(nullable = true)
	private String horaevento;
	
	@Column(nullable = true)
	private Date dtcad;
	
	@Column(nullable = true)
	private int idusu;
	
	@Column(nullable = true)
	private String delet;

	public Campanha() {
		super();
	}

	public Campanha(Long idcampanha, String nomecamp, String descricao, String nomeresponsavel, Long idcategoria,
			String email, String telefone, String site, String local, Date dtevento, String horaevento, Date dtcad,
			int idusu, String delet) {
		super();
		this.idcampanha = idcampanha;
		this.nomecamp = nomecamp;
		this.descricao = descricao;
		this.nomeresponsavel = nomeresponsavel;
		this.idcategoria = idcategoria;
		this.email = email;
		this.telefone = telefone;
		this.site = site;
		this.local = local;
		this.dtevento = dtevento;
		this.horaevento = horaevento;
		this.dtcad = dtcad;
		this.idusu = idusu;
		this.delet = delet;
	}

	public Long getIdcampanha() {
		return idcampanha;
	}

	public void setIdcampanha(Long idcampanha) {
		this.idcampanha = idcampanha;
	}

	public String getNomecamp() {
		return nomecamp;
	}

	public void setNomecamp(String nomecamp) {
		this.nomecamp = nomecamp;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getNomeresponsavel() {
		return nomeresponsavel;
	}

	public void setNomeresponsavel(String nomeresponsavel) {
		this.nomeresponsavel = nomeresponsavel;
	}

	public Long getIdcategoria() {
		return idcategoria;
	}

	public void setIdcategoria(Long idcategoria) {
		this.idcategoria = idcategoria;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public Date getDtevento() {
		return dtevento;
	}

	public void setDtevento(Date dtevento) {
		this.dtevento = dtevento;
	}

	public String getHoraevento() {
		return horaevento;
	}

	public void setHoraevento(String horaevento) {
		this.horaevento = horaevento;
	}

	public Date getDtcad() {
		return dtcad;
	}

	public void setDtcad(Date dtcad) {
		this.dtcad = dtcad;
	}

	public int getIdusu() {
		return idusu;
	}

	public void setIdusu(int idusu) {
		this.idusu = idusu;
	}

	public String getDelet() {
		return delet;
	}

	public void setDelet(String delet) {
		this.delet = delet;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(delet, descricao, dtcad, dtevento, email, horaevento, idcampanha, idcategoria, idusu, local,
				nomecamp, nomeresponsavel, site, telefone);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Campanha other = (Campanha) obj;
		return Objects.equals(delet, other.delet) && Objects.equals(descricao, other.descricao)
				&& Objects.equals(dtcad, other.dtcad) && Objects.equals(dtevento, other.dtevento)
				&& Objects.equals(email, other.email) && Objects.equals(horaevento, other.horaevento)
				&& Objects.equals(idcampanha, other.idcampanha) && Objects.equals(idcategoria, other.idcategoria)
				&& idusu == other.idusu && Objects.equals(local, other.local)
				&& Objects.equals(nomecamp, other.nomecamp) && Objects.equals(nomeresponsavel, other.nomeresponsavel)
				&& Objects.equals(site, other.site) && Objects.equals(telefone, other.telefone);
	}

	
	
	
	
	
	
	
	
	

}