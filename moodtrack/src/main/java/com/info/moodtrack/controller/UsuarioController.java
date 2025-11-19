package com.info.moodtrack.controller;

import com.info.moodtrack.dto.usuario.UsuarioDto;
import com.info.moodtrack.model.Usuario;
import com.info.moodtrack.service.usuario.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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

}
