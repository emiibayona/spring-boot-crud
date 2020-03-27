package com.magicbussines.adminedif.interfaceServices;

import java.util.List;
import java.util.Optional;

import com.magicbussines.adminedif.models.Usuario;

public interface IUsuarioService {

		public List<Usuario> listar();
		public Optional<Usuario>listarId(long ci);
		public int save(Usuario u);
		public void delete(long ci);
		
}
