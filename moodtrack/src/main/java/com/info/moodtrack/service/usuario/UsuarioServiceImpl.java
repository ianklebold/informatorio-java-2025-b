package com.info.moodtrack.service.usuario;

import com.info.moodtrack.dto.usuario.UsuarioCreateDto;
import com.info.moodtrack.dto.usuario.UsuarioDto;
import com.info.moodtrack.mapper.usuario.UsuarioMapper;
import com.info.moodtrack.model.Usuario;
import com.info.moodtrack.repository.usuario.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

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

    @Override
    public Optional<UsuarioDto> obtenerPorId(UUID id) {
        Optional<Usuario> usuario = usuarioRepository.findById(id);
        if (usuario.isPresent()) {
            Usuario usuarioEntity = usuario.get();
            return Optional.of( UsuarioMapper.toDto(usuarioEntity) );
        }
        return Optional.empty();
    }

    @Override
    public UsuarioDto crearUsuario(UsuarioCreateDto usuarioCreateDto) {
        Usuario usuario = UsuarioMapper.toEntity( usuarioCreateDto );
        usuario = usuarioRepository.save( usuario );
        return UsuarioMapper.toDto( usuario );
    }
}
