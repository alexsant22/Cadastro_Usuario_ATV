package com.example.Cadastro_Usuario.Controller;

import com.example.Cadastro_Usuario.DTO.UsuariosDTO;
import com.example.Cadastro_Usuario.Entity.Usuarios;
import com.example.Cadastro_Usuario.Service.UsuariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/usuario")
public class UsuariosController {
    @Autowired
    private UsuariosService service;

    @GetMapping("/buscar")
    public List<Usuarios> getAll(@RequestParam(required = false) String nome) {
        if (nome != null && !nome.isEmpty()) {
            return service.getAllByName(nome);
        } else {
            return service.getAll();
        }
    }

    @GetMapping("/buscar/{id}")
    public ResponseEntity<UsuariosDTO> getById(@PathVariable Long id) {
        Optional<UsuariosDTO> optional = service.getById(id);

        if (optional.isPresent()) {
            return ResponseEntity.ok(optional.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/buscarCPF/{cpf}")
    public ResponseEntity<UsuariosDTO> getByCpf(@PathVariable String cpf) {
        Optional<UsuariosDTO> optional = service.getByCpf(cpf);

        if (optional.isPresent()) {
            return ResponseEntity.ok(optional.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/adicionar")
    public ResponseEntity<UsuariosDTO> create(@RequestBody UsuariosDTO usuariosDTO) {
        UsuariosDTO saveUsuariosDTO = service.create(usuariosDTO);

        return ResponseEntity.status(HttpStatus.CREATED).body(saveUsuariosDTO);
    }

    @PutMapping("/atualizar/{id}")
    public ResponseEntity<UsuariosDTO> updateUsuario(@PathVariable Long id, @RequestBody UsuariosDTO usuariosDTO) {
        Optional<UsuariosDTO> optional = service.updateUsuario(id, usuariosDTO);

        if (optional.isPresent()) {
            return ResponseEntity.ok(optional.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/atualizarSenha/{id}")
    public ResponseEntity<UsuariosDTO> updateSenha(@PathVariable Long id, @RequestBody UsuariosDTO usuariosDTO) {
        Optional<UsuariosDTO> optional = service.updateSenha(id, usuariosDTO);

        if (optional.isPresent()) {
            return ResponseEntity.ok(optional.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/deletar/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        if (service.delete(id)) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
