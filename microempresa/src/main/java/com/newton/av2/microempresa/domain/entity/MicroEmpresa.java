package com.newton.av2.microempresa.domain.entity;

import java.time.LocalDateTime;

import com.newton.av2.microempresa.api.MicroEmpresaDto;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MicroEmpresa {

	@Id
	private String id;
	
	private String nome;
	
	private String cnpj;
	
    private String email;
	
	private LocalDateTime dataDeCadastro; 
	
	private LocalDateTime modifiedAt;	
	
	public MicroEmpresa(MicroEmpresaDto p) {
		this.setNome(p.getNome());
		this.setCnpj(p.getCnpj());
		this.setEmail(p.getEmail());

	}
}