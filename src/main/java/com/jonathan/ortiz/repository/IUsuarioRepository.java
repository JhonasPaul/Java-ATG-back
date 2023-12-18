package com.jonathan.ortiz.repository;

import com.jonathan.ortiz.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUsuarioRepository extends JpaRepository<Usuario, Long> {
}
