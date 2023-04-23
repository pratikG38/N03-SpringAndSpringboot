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
import org.tnsif.placementmanagement.entites.College;
import org.tnsif.placementmanagement.entites.Student;
import org.tnsif.placementmanagement.services.CollegeService;

@RestController
public class CollegeController {
	@Autowired
	private CollegeService service;
	
	//REST full api for crud operation
	//to retriene all record
	@GetMapping("/colleges")
	public List<College> listAll()
	{
		return service.retrieveAllCollege();
	}
	//retrieve with specific id
		@GetMapping("/colleges/{id}")
		public ResponseEntity<College>get(@PathVariable Integer id)
		{
			try
			{
				College colleges=service.retrieveCollege(id);
				return new ResponseEntity<College>(colleges,HttpStatus.OK);
				
			}
			catch(NoSuchElementException e) {
				return new ResponseEntity<College>(HttpStatus.NOT_FOUND);
				
				
			}
			
			
		}
		//remove data
		@DeleteMapping("/colleges/{id}")
		public void remove(@PathVariable Integer id) 
		{
			service.deleteCollege(id);
		}
		//insert the data
		@PostMapping("/colleges")
		public void insert(@RequestBody College college)
		{
			service.addCollege(college);
		}
		
		//update
		@PutMapping("/colleges/{id}")
		public ResponseEntity<?>update(@RequestBody College college, @PathVariable Integer id)
		{
			try
			{
			College c1=service.retrieveCollege(id);
			service.addCollege(college);
			return new ResponseEntity<>(HttpStatus.OK);
			
			}
			catch(NoSuchElementException e) {
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
				
			}
			
		}
		
}
