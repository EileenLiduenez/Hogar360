package com.pragma.home360.home.infrastructure.repositories.mysql;

import com.pragma.home360.home.infrastructure.entities.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CategoryRepository extends JpaRepository<CategoryEntity, Long> {

}
