package com.unab.c4jornadatardenosql.IService;

import java.util.List;
import java.util.Optional;

import com.unab.c4jornadatardenosql.Collection.Personas;

public interface IPersonasService {
	 
		public List<Personas> all();
	    
	    public Optional<Personas> findById(String id);
	    
	    public Personas save(Personas personas);
	    
	    public void delete(String id);
}
