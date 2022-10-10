package com.example.demoJava.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demoJava.models.Usuario;

@Repository
public interface UsuarioDao extends JpaRepository<Usuario, Integer> {

	Usuario findByNombre(String nombre);
}
