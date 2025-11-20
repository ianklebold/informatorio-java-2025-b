package com.info.moodtrack.controller;

import com.info.moodtrack.dto.usuario.UsuarioCreateDto;
import com.info.moodtrack.dto.usuario.UsuarioDto;
import com.info.moodtrack.model.Usuario;
import com.info.moodtrack.service.usuario.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/usuarios")
public class UsuarioController {

    private final UsuarioService usuarioService;

    @Autowired
    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping
    public List<UsuarioDto> getUsuarios() {

        List<UsuarioDto> usuarios = usuarioService.obtenerTodos();
        return usuarios;
    }

    @GetMapping("/{id}")
    public ResponseEntity<UsuarioDto> getUsuarioById(
            @PathVariable(name = "id") UUID id
            ) {
        Optional<UsuarioDto> usuario = usuarioService.obtenerPorId(id);

        if( usuario.isPresent() ){
            return ResponseEntity.ok( usuario.get() ) ;
        }else{
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping()
    public ResponseEntity<UsuarioDto> createUsuario(
            @RequestBody UsuarioCreateDto usuarioCreateDto
            ){
        UsuarioDto usuarioCreado = usuarioService.crearUsuario(usuarioCreateDto);
        return ResponseEntity.ok( usuarioCreado );
    }


}
