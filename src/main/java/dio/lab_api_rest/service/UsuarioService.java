package dio.lab_api_rest.service;

import dio.lab_api_rest.model.Usuario;

public interface UsuarioService {
    Usuario findById(Long id);

    Usuario criar(Usuario userToCreate);
}
