/**
 * 
 */
package com.prueba.backendglobal.dao.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.prueba.backendglobal.entity.UsuarioEntity;

/**
 * @author eandr
 *
 */
@Repository
public interface UsuarioDao extends CrudRepository<UsuarioEntity, Long> {

}
