package pe.edu.tecsup.Resmascota.services;

import java.util.List;

import pe.edu.tecsup.Resmascota.entities.Usuario;

public interface UsuarioService {
	
Usuario findByUsernameAndPassword(String nombre_usu, String password_usu);
	
	Usuario findByUsername(String nombre_usu);
	
	public List<Usuario> findAll();
	
	public Usuario findById(Long id);
	
	public void save(Usuario usuarios);
	
	public void deleteById(Long id);


}
