package com.prueba.backendglobal.service.interfaces;

import java.util.List;

import com.prueba.backendglobal.entity.UsuarioEntity;

public interface UsuarioService {

	public void save(UsuarioEntity usuario) throws Exception;
	
	public List<UsuarioEntity> listAll() throws Exception;
	
	public UsuarioEntity getById(Long id) throws Exception;
}
