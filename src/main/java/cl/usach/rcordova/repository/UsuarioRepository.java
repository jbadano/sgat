package cl.usach.rcordova.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import cl.usach.rcordova.model.Usuario;
import cl.usach.rcordova.model.UsuarioInterface;



@Repository("usuarioRepository")
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	
	@Query("select u from Usuario u where u.userName = :userName")
	UsuarioInterface findByUserName(@Param("userName") String userName);
	
}
