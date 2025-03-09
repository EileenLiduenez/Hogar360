package com.pragma.home360.home.infrastructure.repositories.mysql;

import com.pragma.home360.home.infrastructure.entities.HomeEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface HomeRepository extends JpaRepository<HomeEntity, Long> {

}

