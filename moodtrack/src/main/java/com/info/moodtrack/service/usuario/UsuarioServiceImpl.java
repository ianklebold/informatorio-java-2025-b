package com.info.moodtrack.service.usuario;

import com.info.moodtrack.dto.usuario.UsuarioDto;
import com.info.moodtrack.mapper.usuario.UsuarioMapper;
import com.info.moodtrack.model.Usuario;
import com.info.moodtrack.repository.usuario.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    private UsuarioRepository usuarioRepository;

    @Autowired
    public UsuarioServiceImpl(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public List<UsuarioDto> obtenerTodos() {
        List<Usuario> usuarioList = usuarioRepository.findAll();

        return UsuarioMapper.toDtoList( usuarioList );
    }
}
