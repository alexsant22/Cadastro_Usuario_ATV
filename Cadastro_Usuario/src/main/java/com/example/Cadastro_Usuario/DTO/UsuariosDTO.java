package com.example.Cadastro_Usuario.DTO;

import com.example.Cadastro_Usuario.Entity.Usuarios;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsuariosDTO implements Serializable {
    private Long id;
    private String nome;
    private String sobrenome;
    private String cpf;
    private String email;
    private String username;
    private String senha;
    private Date data_nascimento;

    public Usuarios toUsucarios() {
        return new Usuarios(
                this.id,
                this.nome,
                this.sobrenome,
                this.cpf,
                this.email,
                this.username,
                this.senha,
                this.data_nascimento
        );
    }

    public UsuariosDTO fromUsuarios(Usuarios usuarios) {
        return new UsuariosDTO(
                usuarios.getId(),
                usuarios.getNome(),
                usuarios.getSobrenome(),
                usuarios.getCpf(),
                usuarios.getEmail(),
                usuarios.getUsername(),
                usuarios.getSenha(),
                usuarios.getData_nascimento()
        );
    }
}
