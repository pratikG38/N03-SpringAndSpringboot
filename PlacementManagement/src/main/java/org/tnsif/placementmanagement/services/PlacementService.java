package org.tnsif.placementmanagement.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tnsif.placementmanagement.entites.College;
import org.tnsif.placementmanagement.entites.Placement;
import org.tnsif.placementmanagement.repository.PacementRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class PlacementService {

@Autowired
private PacementRepository  repo1;

//insertion/addition/creation
    
	public void add(Placement placement)
	{
		repo1.save(placement);
	}
	
	//retrieve with specific id
			public Placement retrieve(Integer id)
			{
				return repo1.findById(id).get();
			}

			//delete
			public void delete(Integer id)
			{
				repo1.deleteById(id);
			}
		
			//to retrieve all the recordes
			public List<Placement> retrieveAll(){
				return repo1.findAll();
			}
}
