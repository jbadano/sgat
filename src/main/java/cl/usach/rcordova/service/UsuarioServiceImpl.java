package cl.usach.rcordova.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cl.usach.rcordova.model.Usuario;
import cl.usach.rcordova.model.UsuarioInterface;
import cl.usach.rcordova.repository.UsuarioRepository;

@Service("usuarioService")
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Transactional
	public UsuarioInterface save(UsuarioInterface usuario) {
		return usuarioRepository.save((Usuario)usuario);
	}

	public boolean findByLogin(String userName, String password) {	
		UsuarioInterface usu = usuarioRepository.findByUserName(userName);
		
		if(usu != null && usu.getPassword().equals(password)) {
			return true;
		} 
		
		return false;		
	}

	public boolean findByUserName(String userName) {
		UsuarioInterface usu = usuarioRepository.findByUserName(userName);
		
		if(usu != null) {
			return true;
		}
		
		return false;
	}
}
