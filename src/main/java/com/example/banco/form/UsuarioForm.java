package com.example.banco.form;

import java.util.Date;

import javax.persistence.Column;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.example.banco.modelo.Usuario;
import com.example.banco.repository.UsuarioRepository;

public class UsuarioForm {

	@NotEmpty @NotNull	@Length(min = 4)
	private String nome;
	
	@Column(unique=true, nullable=false,insertable=true, updatable=true)
	@NotEmpty @NotNull 	@Length(min = 8)
	private String email;
	@NotEmpty @NotNull	@Length(min = 11)
	private String cpf;
	
	@NotNull
	private Date dataNascimento;
	
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
	
	public Usuario converter(UsuarioRepository usuarioRepository) {
		return new Usuario(this.nome, this.email, this.cpf, this.dataNascimento);
	}
	
	public Usuario atualizar(Long id, UsuarioRepository usuarioRepository) {
		Usuario usuario = usuarioRepository.getOne(id);
		usuario.setNome(this.nome);
		usuario.setEmail(this.email);
		usuario.setCpf(this.cpf);
		usuario.setdataNascimento(this.dataNascimento);
		
		return usuario;
		
	}
}
