package com.unab.c4jornadatardenosql.IRepository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.unab.c4jornadatardenosql.Collection.Personas;

public interface IPersonasRepository extends MongoRepository<Personas, String> {

}
