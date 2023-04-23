package org.tnsif.placementmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.tnsif.placementmanagement.entites.Student;
import org.tnsif.placementmanagement.entites.User;

public interface UserRepository extends JpaRepository<User,Integer>{

}
