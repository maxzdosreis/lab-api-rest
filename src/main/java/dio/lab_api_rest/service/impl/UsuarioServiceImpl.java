package dio.lab_api_rest.service.impl;

import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import dio.lab_api_rest.model.Usuario;
import dio.lab_api_rest.repository.UsuarioRepository;
import dio.lab_api_rest.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService {
   private final UsuarioRepository usuarioRepository;

    public UsuarioServiceImpl(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public Usuario findById(Long id) {
        return usuarioRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public Usuario criar(Usuario userToCreate) {
        if (usuarioRepository.existsByAccountNumber(userToCreate.getConta().getNumber())) {
            throw new IllegalArgumentException("Esse número de conta já existe");
        }
        return usuarioRepository.save(userToCreate);
    } 
}
