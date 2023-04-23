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
import org.tnsif.placementmanagement.entites.User;
import org.tnsif.placementmanagement.services.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService uservice;
	//REST full api for crud operation
		//to retriene all record
		@GetMapping("/users")
		public List<User> listAll()
		{
			return uservice.retrieveAllUser();
		}
		//retrieve with specific id
			@GetMapping("/users/{id}")
			public ResponseEntity<User>get(@PathVariable Integer id)
			{
				try
				{
					User users=uservice.retrieveUser(id);
					return new ResponseEntity<User>(users,HttpStatus.OK);
					
				}
				catch(NoSuchElementException e) {
					return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
					
					
				}
				
				
			}
			//remove data
			@DeleteMapping("/users/{id}")
			public void remove(@PathVariable Integer id) 
			{
				uservice.deleteUser(id);
			}
			//insert the data
			@PostMapping("/users")
			public void insert(@RequestBody User user)
			{
				uservice.addUser(user);
			}
			
			//update
			@PutMapping("/users/{id}")
			public ResponseEntity<?>update(@RequestBody User user, @PathVariable Integer id)
			{
				try
				{
				User u1=uservice.retrieveUser(id);
				uservice.addUser(user);
				return new ResponseEntity<>(HttpStatus.OK);
				
				}
				catch(NoSuchElementException e) {
					return new ResponseEntity<>(HttpStatus.NOT_FOUND);
					
				}
				
			}

}
