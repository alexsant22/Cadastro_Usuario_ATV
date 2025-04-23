package com.example.Cadastro_Usuario.Repository;

import com.example.Cadastro_Usuario.Entity.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UsuariosRepository extends JpaRepository<Usuarios, Long> {

    public List<Usuarios> findAllByNome(String nome); // Buscar com base no 'nome'

    public Optional<Usuarios> findAllByCpf(String cpf); // Buscar com base no 'cpf'
}
