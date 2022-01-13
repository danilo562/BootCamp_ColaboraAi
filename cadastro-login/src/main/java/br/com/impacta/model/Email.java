package br.com.impacta.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.data.annotation.Transient;

@Entity(name="email")
public class Email implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idemail;
	
	
	
	@Column(nullable = true)
	private String email;
	
	
	
	

	public Email() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Email(Long idemail, String email) {
		super();
		this.idemail = idemail;
		this.email = email;
	}

	public Long getIdemail() {
		return idemail;
	}

	public void setIdemail(Long idemail) {
		this.idemail = idemail;
	}

	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(email);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Email other = (Email) obj;
		return Objects.equals(email, other.email);
	}
	
	
	
	

}
