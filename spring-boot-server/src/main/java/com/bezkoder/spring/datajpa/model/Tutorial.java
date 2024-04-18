package com.bezkoder.spring.datajpa.model;

import javax.persistence.*;

@Entity
@Table(name = "tutorials")
public class Tutorial {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "nome")
	private String nome;

	@Column(name = "sobrenome")
	private String sobrenome;

	@Column(name = "publicado")
	private boolean publicado;

	public Tutorial() {

	}

	public Tutorial(String nome, String sobrenome, boolean publicado) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.publicado = publicado;
	}

	public long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public boolean isPublicado() {
		return publicado;
	}

	public void setPublicado(boolean isPublicado) {
		this.publicado = isPublicado;
	}

	@Override
	public String toString() {
		return "Tutorial [id=" + id + ", nome=" + nome + ", sobrenome=" + sobrenome + ", publicado=" + publicado + "]";
	}

}
