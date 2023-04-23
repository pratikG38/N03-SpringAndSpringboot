package org.tnsif.placementmanagement.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tnsif.placementmanagement.entites.Admin;
import org.tnsif.placementmanagement.entites.Student;
import org.tnsif.placementmanagement.repository.AdminRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class AdminServices {
	@Autowired
	
	private AdminRepository adminrepo;
	//insertion/addition/creation
		public void addAdmin(Admin admin)
		{
			adminrepo.save(admin);
		}
		
		//retrieve with specific id
		public Admin retrieveAdmin(Integer id)
		{
			return adminrepo.findById(id).get();
		}
		
		//delete
		public void deleteAdmin(Integer id)
		{
			adminrepo.deleteById(id);
		}
		
		//to retrieve all the recordes
		public List<Admin> retrieveAllAdmin(){
			return adminrepo.findAll();
		}
}
