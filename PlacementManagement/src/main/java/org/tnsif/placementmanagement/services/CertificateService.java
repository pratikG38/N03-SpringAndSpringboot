package org.tnsif.placementmanagement.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.tnsif.placementmanagement.entites.Certificate;
import org.tnsif.placementmanagement.repository.CertificateRepo;

@Service
@Transactional
public class CertificateService {
	
	@Autowired
	private CertificateRepo Certificaterepo;
	
	//insertion/addition/creation
	    
		public void addC(Certificate certificate)
		{
			Certificaterepo.save(certificate);
		}
		//retrieve with specific id
		public Certificate retrieveC(Integer id)
		{
			return Certificaterepo.findById(id).get();
		}
		//delete
		public void deleteC(Integer id)
		{
			Certificaterepo.deleteById(id);
		}
		
		//to retrieve all the recordes
		public List<Certificate> retrieveAll(){
			return Certificaterepo.findAll();
		}

}
