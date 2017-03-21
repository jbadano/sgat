package cl.usach.rcordova.service;

import cl.usach.rcordova.model.UsuarioInterface;

public interface UsuarioService {
	UsuarioInterface save(UsuarioInterface usuario);
	boolean findByLogin(String userName, String password);
	boolean findByUserName(String userName);
}
