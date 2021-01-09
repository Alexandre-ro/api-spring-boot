package com.example.banco.dto;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import com.example.banco.modelo.Usuario;

public class UsuarioDTO {

	private Long id;
	private String nome;
	private String email;
	private String cpf;
	private Date dataNascimento;
	
	public UsuarioDTO(Usuario usuario) {
		
	this.id              = usuario.getId();
	this.nome            = usuario.getNome();
	this.email 	         = usuario.getEmail();
	this.cpf 		     = usuario.getCpf();
	this.dataNascimento  = usuario.getdataNascimento();
	}
	
	public static List<UsuarioDTO> converter(List<Usuario> usuarios) {
		return usuarios.stream().map(UsuarioDTO::new).collect(Collectors.toList());
	}

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public String getCpf() {
		return cpf;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}
	
}






