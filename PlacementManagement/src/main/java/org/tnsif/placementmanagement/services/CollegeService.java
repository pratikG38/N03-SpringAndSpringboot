package org.tnsif.placementmanagement.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tnsif.placementmanagement.entites.College;
import org.tnsif.placementmanagement.repository.CollegeRepo;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class CollegeService {
	@Autowired
	private CollegeRepo Collegerepo;
	
	//insertion/addition/creation
	    
		public void addCollege(College college)
		{
			Collegerepo.save(college);
		}
		//retrieve with specific id
		public College retrieveCollege(Integer id)
		{
			return Collegerepo.findById(id).get();
		}
		//delete
		public void deleteCollege(Integer id)
		{
			Collegerepo.deleteById(id);
		}
		
		//to retrieve all the recordes
		public List<College> retrieveAllCollege(){
			return Collegerepo.findAll();
		}
		
}
