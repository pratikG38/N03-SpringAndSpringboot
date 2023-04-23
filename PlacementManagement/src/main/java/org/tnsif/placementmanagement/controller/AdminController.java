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
import org.tnsif.placementmanagement.entites.Admin;
import org.tnsif.placementmanagement.entites.Student;
import org.tnsif.placementmanagement.services.AdminServices;

@RestController
public class AdminController {

	@Autowired
	private AdminServices adminservice;
	
	@GetMapping("/admins")
	public List<Admin> listAllAdmin()
	{
		return adminservice.retrieveAllAdmin();
	}
	//retrieve with specific id
		@GetMapping("/admins/{id}")
		public ResponseEntity<Admin>get(@PathVariable Integer id)
		{
			try
			{
				Admin admin=adminservice.retrieveAdmin(id);
				return new ResponseEntity<Admin>(admin,HttpStatus.OK);
				
			}
			catch(NoSuchElementException e) {
				return new ResponseEntity<Admin>(HttpStatus.NOT_FOUND);
				
				
			}
			
			
		}
		
		//remove data
		@DeleteMapping("/admins/{id}")
		public void remove(@PathVariable Integer id) 
		{
			adminservice.deleteAdmin(id);
		}
		
		//insert the data
		@PostMapping("/admins")
		public void insert(@RequestBody Admin admin)
		{
			adminservice.addAdmin(admin);
		}
		
		//update
		@PutMapping("/admins/{id}")
		public ResponseEntity<?>update(@RequestBody Admin admin, @PathVariable Integer id)
		{
			try
			{
			Admin a1=adminservice.retrieveAdmin(id);
			adminservice.addAdmin(admin);
			return new ResponseEntity<>(HttpStatus.OK);
			
			}
			catch(NoSuchElementException e) {
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
				
			}
			
		}

	
}
