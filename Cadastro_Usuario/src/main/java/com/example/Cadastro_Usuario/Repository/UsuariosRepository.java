package com.example.Cadastro_Usuario.Repository;

import com.example.Cadastro_Usuario.Entity.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuariosRepository extends JpaRepository<Usuarios, Long> {
}
