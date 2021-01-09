package com.example.banco.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.banco.modelo.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	List<Usuario> findByNome(String nomeUsuario);

}
