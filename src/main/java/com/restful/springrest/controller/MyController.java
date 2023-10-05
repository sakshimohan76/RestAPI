package com.restful.springrest.controller;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.restful.springrest.entities.Loads;
import com.restful.springrest.services.LoadServices;
@RestController
public class MyController {
	
	@Autowired
	private LoadServices loadService;
	@GetMapping("/home")
	public String Home()
	{
		return "Welcome to this application.";
	}
	
	@GetMapping("/loads")
	public List<Loads> getLoads()
	{
		return this.loadService.getLoads();
	}
	@GetMapping("/load/{shipperId}")
	public Loads getLoad(@PathVariable UUID shipperId)
	{
		return this.loadService.getLoad(shipperId);
	}
	@GetMapping("/loads/{loadId}")
	public Optional<Loads> getLoadId(@PathVariable int loadId)
	{
		return this.loadService.getLoadId(loadId);
	}
	@PostMapping("/loads")
	public String addLoad(@RequestBody Loads load)
	{
		this.loadService.addLoad(load);
		return "Load details added successfully";
	}
	@PutMapping("/loads/{loadId}")
	public Loads updateLoad(@RequestBody Loads load, @PathVariable("loadId") int loadId)
	{
		this.loadService.updateLoad(load,loadId);
		return load;
	}
	@DeleteMapping("/loads/{loadId}")
	public ResponseEntity<HttpStatus> deleteLoad(@PathVariable int loadId){
		try {
			this.loadService.deleteLoad(loadId);
			return new ResponseEntity<>(HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
