package com.example.Cadastro_Usuario.Service;

import com.example.Cadastro_Usuario.DTO.UsuariosDTO;
import com.example.Cadastro_Usuario.Entity.Usuarios;
import com.example.Cadastro_Usuario.Repository.UsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuariosService {
    @Autowired
    private UsuariosRepository repository;

    // Buscar todos
    public List<Usuarios> getAll() {
        return repository.findAll();
    }

    // Buscar Usuário por ID
    public Optional<UsuariosDTO> getById(Long id) {
        Optional<Usuarios> optional = repository.findById(id);

        if (optional.isPresent()) {
            UsuariosDTO usuariosDTO = new UsuariosDTO();
            return Optional.of(usuariosDTO.fromUsuarios(optional.get()));
        } else {
            return Optional.empty();
        }
    }

    // Cadastrar um Usuário completo
    public UsuariosDTO create(UsuariosDTO usuariosDTO) {
        Usuarios usuarios = usuariosDTO.toUsuarios();
        usuarios = repository.save(usuarios);
        return usuariosDTO.fromUsuarios(usuarios);
    }

    // Atualizar dados do Usuário **Sem seu 'username' e 'senha'**
    public Optional<UsuariosDTO> updateUsuario(Long id, UsuariosDTO usuariosDTO) {
        Optional<Usuarios> optional = repository.findById(id);

        if (optional.isPresent()) {
            Usuarios usuarios = optional.get();

            usuarios.setNome(usuariosDTO.getNome());
            usuarios.setSobrenome(usuariosDTO.getSobrenome());
            usuarios.setCpf(usuariosDTO.getCpf());
            usuarios.setEmail(usuariosDTO.getEmail());
            usuarios.setData_nascimento(usuariosDTO.getData_nascimento());

            return Optional.of(usuariosDTO.fromUsuarios(usuarios));
        } else {
            return Optional.empty();
        }
    }

    // Deletar Usuário
    public boolean delete(Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }

    // Atualizar apenas 'senha' do Usuário.
    public Optional<UsuariosDTO> updateSenha(Long id, UsuariosDTO usuariosDTO) {
        Optional<Usuarios> optional = repository.findById(id);

        if (optional.isPresent()) {
            Usuarios usuarios = optional.get();

            usuarios.setSenha(usuariosDTO.getSenha());

            return Optional.of(usuariosDTO.fromUsuarios(usuarios));
        } else {
            return Optional.empty();
        }
    }

    // Buscar usuários com base em seu 'nome'


    // Buscar usuários com base em seu 'cpf'
}
