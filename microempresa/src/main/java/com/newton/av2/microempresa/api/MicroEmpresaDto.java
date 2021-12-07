package com.newton.av2.microempresa.api;

import java.time.LocalDateTime;

import com.newton.av2.microempresa.domain.entity.MicroEmpresa;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MicroEmpresaDto {

	private String id;
	
	private String nome;
	
	private String cnpj;
	
    private String email;
	
	private LocalDateTime dataDeCadastro; 
	
	private LocalDateTime modifiedAt;	
	
	public MicroEmpresaDto(MicroEmpresa p) {
		this.setId(p.getId());
		this.setNome(p.getNome());
		this.setCnpj(p.getCnpj());
		this.setEmail(p.getEmail());
		
		this.setDataDeCadastro(p.getDataDeCadastro());
		this.setModifiedAt(p.getModifiedAt());		
	}
}
