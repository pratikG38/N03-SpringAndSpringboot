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
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.tnsif.placementmanagement.entites.Certificate;
import org.tnsif.placementmanagement.services.CertificateService;

@RestController
public class CertificateController {

	@Autowired
	private CertificateService service;
	
	//REST full API for CRUD operation
	//to retrieve all record
	
	@GetMapping("/certificates")
	public List<Certificate> listAll()
	{
		return service.retrieveAll();
	}
	
	//retrieve with specific id
	@GetMapping("/certificates/{id}")
	public ResponseEntity<Certificate>get(@PathVariable Integer id)
	{
		try
		{
			Certificate certificate=service.retrieveC(id);
			return new ResponseEntity<Certificate>(certificate,HttpStatus.OK);
			
		}
		catch(NoSuchElementException e) {
			return new ResponseEntity<Certificate>(HttpStatus.NOT_FOUND);
			
			
		}
		
		
	}
	//remove data
	@DeleteMapping("/certificates/{id}") 
	public void remove(@PathVariable Integer id) 
	{
		service.deleteC(id);
	}
	
	//insert the data
	@PostMapping("/certificates")
	public void insert(@RequestBody Certificate certificate)
	{
		service.addC(certificate);
	}
	
	//update
	@PutMapping("/certificates/{id}")
	public ResponseEntity<?>update(@RequestBody Certificate certificate, @PathVariable Integer id)
	{
		try
		{
		Certificate s1=service.retrieveC(id);
		service.addC(certificate);
		return new ResponseEntity<>(HttpStatus.OK);
		
		}
		catch(NoSuchElementException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			
		}
		
	}
	
}

