package com.ranjan.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ranjan.entity.Plan;

@Repository
public interface PlanRepo extends JpaRepository<Plan, Integer>{

}
