package cl.nessfit.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.nessfit.web.model.Usuario;
import cl.nessfit.web.repositorio.IUsuarioRepository;

@Service
public class UsuarioService implements IUsuarioService {

	@Autowired
    private IUsuarioRepository usuarioRepository;

    @Override
    public List<Usuario> verTodosLosUsuarios() {
	return usuarioRepository.findAll();
    }

    @Override
    public List<Usuario> verAdministrativos() {
	return usuarioRepository.findByRolId(2);
    }
    
    @Override
    public List<Usuario> verClientes() {
	return usuarioRepository.findByRolId(3);
    }

    @Override
    public void guardar(Usuario usuario) {
	usuarioRepository.save(usuario);
    }

    @Override
    public Usuario buscarPorRut(String rut) {
	Usuario usuario = usuarioRepository.findByRut(rut);
	return usuario;
    }
}
    
