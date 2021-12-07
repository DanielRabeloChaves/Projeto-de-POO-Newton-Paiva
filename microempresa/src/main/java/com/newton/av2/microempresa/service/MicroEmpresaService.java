package com.newton.av2.microempresa.service;

import java.time.LocalDateTime;
import java.util.List;

import com.newton.av2.microempresa.domain.entity.MicroEmpresa;
import com.newton.av2.microempresa.domain.repository.MicroEmpresaRepository;
import com.newton.av2.microempresa.exception.NotFoundException;

import org.springframework.stereotype.Service;


import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class MicroEmpresaService {

	private final MicroEmpresaRepository microEmpresaRepository;
	
	public MicroEmpresa create(MicroEmpresa p) {
		var now  = LocalDateTime.now();
		
		p.setDataDeCadastro(now);
		p.setModifiedAt(now);
		
		microEmpresaRepository.save(p);
		
		return p;
	}
	
	public MicroEmpresa update(String id, MicroEmpresa p) {
		var existing = get(id);

		existing.setNome(p.getNome());
		existing.setCnpj(p.getCnpj());
		existing.setEmail(p.getEmail());
		
		existing.setModifiedAt(LocalDateTime.now());
		
		microEmpresaRepository.save(existing);
		
		return existing; 

	}
	
	public MicroEmpresa get(String id) {
		var microEmpresa = microEmpresaRepository.findById(id);
		
		if (microEmpresa.isEmpty()) {
			throw new NotFoundException("Micro Empresa with ID " + id + " not found");
		}
		
		return microEmpresa.get();
	}
	
	public List<MicroEmpresa> getAll() {
		return microEmpresaRepository.findAll();
	}
	
	public void delete(String id) {
		get(id);
		
		microEmpresaRepository.deleteById(id);
	}
}
