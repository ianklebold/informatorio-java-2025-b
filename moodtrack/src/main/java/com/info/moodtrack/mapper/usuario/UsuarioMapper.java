package com.info.moodtrack.mapper.usuario;

import com.info.moodtrack.dto.usuario.UsuarioDto;
import com.info.moodtrack.mapper.perfil.PerfilMapper;
import com.info.moodtrack.model.Usuario;

import java.util.List;

public final class UsuarioMapper {
    private UsuarioMapper() {}

    public static UsuarioDto toDto(Usuario usuario){

        if(usuario == null) return null;

        UsuarioDto usuarioDto = new UsuarioDto();
        usuarioDto.setId(usuario.getId());
        usuarioDto.setNombre(usuario.getNombre());
        usuarioDto.setEmail(usuario.getEmail());
        usuarioDto.setPerfilUsuarioDto(PerfilMapper.toDto(usuario.getPerfil()));
        return usuarioDto;

    }

    public static List<UsuarioDto> toDtoList(List<Usuario> usuarios){
        return usuarios.stream()
                .map(usuario -> toDto(usuario))
                .toList();
    }


}
