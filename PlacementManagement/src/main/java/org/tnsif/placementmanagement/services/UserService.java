package org.tnsif.placementmanagement.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tnsif.placementmanagement.entites.College;
import org.tnsif.placementmanagement.entites.User;
import org.tnsif.placementmanagement.repository.CollegeRepo;
import org.tnsif.placementmanagement.repository.UserRepository;

import jakarta.transaction.Transactional;
@Service
@Transactional
public class UserService {
	@Autowired
	private UserRepository urepo;
	
	//insertion/addition/creation
	    
		public void addUser(User user)
		{
			urepo.save(user);
		}
		//retrieve with specific id
		public User retrieveUser(Integer id)
		{
			return urepo.findById(id).get();
		}
		//delete
		public void deleteUser(Integer id)
		{
			urepo.deleteById(id);
		}
		
		//to retrieve all the recordes
		public List<User> retrieveAllUser(){
			return urepo.findAll();
		}

}
