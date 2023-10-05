package com.restful.springrest.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;

import com.restful.springrest.entities.Loads;

public interface LoadServices {

	public List<Loads> getLoads();
	
	public Loads getLoad(UUID shipperId);
	
	public Optional<Loads> getLoadId(int loadId);
	
	public String addLoad(Loads load);

	public void deleteLoad(int loadId);

	public Loads updateLoad(Loads load, int loadId);
}