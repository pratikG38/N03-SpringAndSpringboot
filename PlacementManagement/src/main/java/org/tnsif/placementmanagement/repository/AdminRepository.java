package org.tnsif.placementmanagement.repository;

//import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.tnsif.placementmanagement.entites.Admin;

public interface AdminRepository extends JpaRepository<Admin, Integer> {

}
