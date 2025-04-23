package com.example.Cadastro_Usuario.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Usuarios implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String sobrenome;
    @Column(unique = true)
    private String cpf;
    private String email;
    private String username;
    private String senha;
    private Date data_nascimento;
}


// Id
// Nome
// Sobrenome
// CPF
// Email
// Username
// Senha
// Data de nascimento