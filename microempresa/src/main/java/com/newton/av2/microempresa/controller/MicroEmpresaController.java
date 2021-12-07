package com.newton.av2.microempresa.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.newton.av2.microempresa.api.MicroEmpresaDto;
import com.newton.av2.microempresa.domain.entity.MicroEmpresa;
import com.newton.av2.microempresa.service.MicroEmpresaService;


@RestController
public class MicroEmpresaController {

	private final MicroEmpresaService microEmpresaService;
	
	public MicroEmpresaController(MicroEmpresaService microEmpresaService) {
		this.microEmpresaService = microEmpresaService;
	}
	
	@GetMapping("/microEmpresa/{id}")
	public MicroEmpresaDto getById(@PathVariable String id) {
		var microEmpresa = microEmpresaService.get(id);
		
		return new MicroEmpresaDto(microEmpresa);
	}
	
	@GetMapping("/microEmpresas")
	public List<MicroEmpresaDto> getAll() {
		var microEmpresas = microEmpresaService.getAll();
		
		var microEmpresaDtos = new ArrayList<MicroEmpresaDto>();
		
		for (var microEmpresa: microEmpresas) {
			microEmpresaDtos.add(new MicroEmpresaDto(microEmpresa));
		}
		
		return microEmpresaDtos;
	}
	
	@PostMapping("/microEmpresas")
	public MicroEmpresaDto create(@RequestBody MicroEmpresaDto p) {
		var microEmpresa = new MicroEmpresa(p); 
		
		microEmpresa = microEmpresaService.create(microEmpresa);
		
		return new MicroEmpresaDto(microEmpresa); 
	}
	
	@PutMapping("/microEmpresas/{id}")
	public MicroEmpresaDto update(@PathVariable String id, @RequestBody MicroEmpresaDto p) {
		var microEmpresa = new MicroEmpresa(p);

		microEmpresa = microEmpresaService.update(id, microEmpresa);
		
		return new MicroEmpresaDto(microEmpresa);
	}
	
	@DeleteMapping("/microEmpresas/{id}")
	public ResponseEntity<Void> delete(@PathVariable String id) {
		microEmpresaService.delete(id);
		
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}
}
