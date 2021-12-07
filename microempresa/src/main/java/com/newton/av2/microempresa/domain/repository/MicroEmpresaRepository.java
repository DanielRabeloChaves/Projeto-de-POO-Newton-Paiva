package com.newton.av2.microempresa.domain.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.newton.av2.microempresa.domain.entity.MicroEmpresa;

public interface MicroEmpresaRepository extends MongoRepository<MicroEmpresa, String>{

}

