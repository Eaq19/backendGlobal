/**
 * 
 */
package com.prueba.backendglobal.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.backendglobal.dao.interfaces.UsuarioDao;
import com.prueba.backendglobal.entity.UsuarioEntity;
import com.prueba.backendglobal.service.interfaces.UsuarioService;

/**
 * @author eandr
 *
 */
@Service
public class UsuarioServiceBackend implements UsuarioService {

	@Autowired
	private UsuarioDao usuarioDao;
	
	@Override
	public void save(UsuarioEntity usuario) throws Exception {
		// TODO Auto-generated method stub
		usuarioDao.save(usuario);
	}

	@Override
	public List<UsuarioEntity> listAll() throws Exception {
		// TODO Auto-generated method stub
		return (List<UsuarioEntity>) usuarioDao.findAll();
	}

	@Override
	public UsuarioEntity getById(Long id) throws Exception {
		// TODO Auto-generated method stub
		return usuarioDao.findById(id).get();
	}

}
