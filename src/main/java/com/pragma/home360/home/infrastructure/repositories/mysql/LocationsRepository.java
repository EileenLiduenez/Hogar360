package com.pragma.home360.home.infrastructure.repositories.mysql;

import com.pragma.home360.home.infrastructure.entities.LocationsEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface LocationsRepository extends JpaRepository<LocationsEntity, Long> {

}
