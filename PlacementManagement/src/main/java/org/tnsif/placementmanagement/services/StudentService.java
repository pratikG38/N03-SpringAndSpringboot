package org.tnsif.placementmanagement.services;
//crud operation
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tnsif.placementmanagement.entites.Student;
import org.tnsif.placementmanagement.repository.StudentRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class StudentService {
	@Autowired
	private StudentRepository repo;
	
	//insertion/addition/creation
	public void add(Student student)
	{
		repo.save(student);
	}
	
	//retrieve with specific id
	public Student retrieve(Integer id)
	{
		return repo.findById(id).get();
	}
	
	//delete
	public void delete(Integer id)
	{
		repo.deleteById(id);
	}
	
	//to retrieve all the recordes
	public List<Student> retrieveAll(){
		return repo.findAll();
	}
	

}
