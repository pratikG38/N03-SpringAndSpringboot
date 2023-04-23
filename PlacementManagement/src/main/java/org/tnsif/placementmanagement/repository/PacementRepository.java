package org.tnsif.placementmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.tnsif.placementmanagement.entites.Placement;

public interface PacementRepository extends JpaRepository<Placement,Integer> {

}
