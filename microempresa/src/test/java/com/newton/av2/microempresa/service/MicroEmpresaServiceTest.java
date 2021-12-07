package com.newton.av2.microempresa.service;

import java.util.Optional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.newton.av2.microempresa.domain.entity.MicroEmpresa;
import com.newton.av2.microempresa.domain.repository.MicroEmpresaRepository;

@ExtendWith(MockitoExtension.class)
class MicroEmpresaServiceTest {
	
	@Mock
	private MicroEmpresaRepository microEmpresaRepository;
	
	private MicroEmpresaService unit;

	@BeforeEach
	public void setup() {
		unit = new MicroEmpresaService(microEmpresaRepository);
	}
	
	@Test
	void test_getById_RetornarObj() {
		// given:
		var microEmpresa = new MicroEmpresa();
		microEmpresa.setId("microEmpresa1");
		
		// mock definitions: 
		Mockito.when(microEmpresaRepository.findById("microEmpresa1"))
			.thenReturn(Optional.of(microEmpresa));

		// test:
		var result = unit.get("microEmpresa1");
		
		// assert:
		Assertions.assertEquals(result, microEmpresa);
		
		// verify: 
		Mockito.verify(microEmpresaRepository).findById("microEmpresa1");
	}
}
