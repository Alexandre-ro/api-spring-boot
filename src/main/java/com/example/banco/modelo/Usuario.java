package com.example.banco.modelo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	
	@Column(unique=true)
	private String email;
	
	@Column(unique=true)
	private String cpf;
	
	private Date dataNascimento;

	public Usuario(String nome, String email, String cpf, Date dataNascimento) {
		this.nome            = nome;
		this.email           = email;
		this.cpf             = cpf;
		this.dataNascimento  = dataNascimento;
	}
	
	public Usuario() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getdataNascimento() {
		return dataNascimento;
	}

	public void setdataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
}
