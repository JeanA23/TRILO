package com.trotti.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trotti.api.models.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
