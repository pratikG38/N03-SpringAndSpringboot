package org.tnsif.placementmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.tnsif.placementmanagement.entites.College;

public interface CollegeRepo extends JpaRepository<College,Integer>  {

}
