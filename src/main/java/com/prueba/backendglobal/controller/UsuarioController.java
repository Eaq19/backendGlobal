/**
 * 
 */
package com.prueba.backendglobal.controller;

import java.lang.reflect.Type;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.backendglobal.dto.UsuarioDTO;
import com.prueba.backendglobal.entity.UsuarioEntity;
import com.prueba.backendglobal.service.interfaces.UsuarioService;

/**
 * @author eandr
 *
 */
@RestController
@RequestMapping("/api")
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@Autowired
	private ModelMapper modelMapper;

	@GetMapping("/usuario/{id}")
	public ResponseEntity<?> getByName(@PathVariable("id") long id) throws Exception {
		UsuarioEntity usuario = usuarioService.getById(id);
		if (usuario != null) {
			return new ResponseEntity<>(modelMapper.map(usuario, UsuarioDTO.class), HttpStatus.OK);
		} else {
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		}
	}

	@GetMapping("/usuario")
	public ResponseEntity<?> list() throws Exception {
		Type listType = new TypeToken<List<UsuarioDTO>>(){}.getType();
		List<UsuarioDTO> list = modelMapper.map(usuarioService.listAll(), listType);
		if (list != null) {
			if (list.size() > 0) {
				return new ResponseEntity<>(list, HttpStatus.OK);
			} else {
				return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
			}
		} else {
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		}
	}
	
	@PostMapping("/usuario")
	public ResponseEntity<?> create(@RequestBody UsuarioDTO usuario) throws Exception {
		usuarioService.save(modelMapper.map(usuario, UsuarioEntity.class));
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
}
