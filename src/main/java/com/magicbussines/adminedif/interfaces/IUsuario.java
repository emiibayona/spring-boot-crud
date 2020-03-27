package com.magicbussines.adminedif.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.magicbussines.adminedif.models.Usuario;
@Repository
public interface IUsuario extends CrudRepository<Usuario, Long> {

}
