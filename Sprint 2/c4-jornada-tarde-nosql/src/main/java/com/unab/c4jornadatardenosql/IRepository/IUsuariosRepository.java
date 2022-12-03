package com.unab.c4jornadatardenosql.IRepository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.unab.c4jornadatardenosql.Collection.Usuarios;

public interface IUsuariosRepository extends MongoRepository<Usuarios, String> {

}
