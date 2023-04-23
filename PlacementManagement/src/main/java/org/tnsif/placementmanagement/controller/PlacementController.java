package org.tnsif.placementmanagement.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.tnsif.placementmanagement.entites.Placement;
import org.tnsif.placementmanagement.services.PlacementService;

@RestController
public class PlacementController {
	@Autowired
	private PlacementService service;
	// rest api for crude
	
	@GetMapping("/placements")
	public List<Placement>listAll()
	{
	return service.retrieveAll();
	}
	
	@GetMapping("/placements/{id}")
	public ResponseEntity<Placement>get(@PathVariable Integer id)
	{
	try {
	Placement placement=service.retrieve(id);
	return new ResponseEntity<Placement>(placement,HttpStatus.OK);
	}
	catch (NoSuchElementException e){
	return new ResponseEntity<Placement>(HttpStatus.NOT_FOUND);
	}
	}
	
	@DeleteMapping("/placements/{id}")
	public  void remove (@PathVariable Integer id)
	{
	 service.delete(id);
	}
	
	// to insert
	@PostMapping("/placements")
	public void insert (@RequestBody Placement placement)
	{
	service.add(placement);
	}
	//update
	public ResponseEntity<?>update(@RequestBody Placement placement ,@PathVariable Integer id)
	{
	try {
	Placement p1=service.retrieve(id);
	service.add(placement);
	return new ResponseEntity<>(HttpStatus.OK);
	}
	catch (NoSuchElementException e)
	{
	return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}

	}

}
