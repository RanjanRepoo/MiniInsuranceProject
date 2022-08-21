package com.ranjan.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ranjan.entity.PlanCategory;

@Repository
public interface PlanCategoryRepo extends JpaRepository<PlanCategory, Integer>{

}
