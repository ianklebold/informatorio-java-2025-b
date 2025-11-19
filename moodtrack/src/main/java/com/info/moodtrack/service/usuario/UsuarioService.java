package com.info.moodtrack.service.usuario;

import com.info.moodtrack.dto.usuario.UsuarioDto;

import java.util.List;

public interface UsuarioService {
    List<UsuarioDto> obtenerTodos();
}
