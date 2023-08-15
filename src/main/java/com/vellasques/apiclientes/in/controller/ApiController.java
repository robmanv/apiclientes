package com.vellasques.apiclientes.in.controller;


import com.vellasques.apiclientes.out.entity.Users;
import com.vellasques.apiclientes.out.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/api")
public class ApiController {

    @Autowired
    UserRepository userRepository;

    @PostMapping("/usuario")
    public ResponseEntity<Users> cadastrarCliente(@RequestBody Users cliente) {
        cliente.setUuid(UUID.randomUUID().toString());
        userRepository.save(cliente);

        return new ResponseEntity<>(cliente, HttpStatus.CREATED);
    }

    @GetMapping("/usuarios")
    public ResponseEntity<List<Users>> listarUsuarios() {
        List<Users> usuarios = userRepository.findAll();
        return new ResponseEntity<>(usuarios, HttpStatus.OK);
    }

    @GetMapping("/usuario/{uuid}")
    public ResponseEntity<Users> buscarUsuarioPorUuid(@PathVariable String uuid) {
        Optional<Users> usuarioOptional = userRepository.findById(uuid);
        if (usuarioOptional.isPresent()) {
            Users usuario = usuarioOptional.get();
            return new ResponseEntity<>(usuario, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/usuario/{uuid}")
    public ResponseEntity<Users> atualizarUsuario(@PathVariable String uuid, @RequestBody Users usuarioNovo) {
        Optional<Users> usuarioOptional = userRepository.findById(uuid);
        if (usuarioOptional.isPresent()) {
            Users usuarioAntigo = usuarioOptional.get();
            usuarioAntigo.setName(usuarioNovo.getName());
            usuarioAntigo.setEmail(usuarioNovo.getEmail());
            userRepository.save(usuarioAntigo);
            return new ResponseEntity<>(usuarioAntigo, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/usuario/{uuid}")
    public ResponseEntity<Void> deletarUsuario(@PathVariable String uuid) {
        Optional<Users> usuarioOptional = userRepository.findById(uuid);
        if (usuarioOptional.isPresent()) {
            userRepository.deleteById(uuid);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}

