package com.ranjan.service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ranjan.entity.Plan;
import com.ranjan.entity.PlanCategory;
import com.ranjan.repo.PlanCategoryRepo;
import com.ranjan.repo.PlanRepo;

@Service
public class PlanServiceImpl implements PlanService{
	
	@Autowired
	PlanCategoryRepo planCategoryRepo;
	@Autowired
	PlanRepo planRepo;

	@Override
	public Map<Integer, String> getCategories() {
		// TODO Auto-generated method stub
		
		List<PlanCategory> planCategorys = planCategoryRepo.findAll();
		
		Map<Integer, String> result = planCategorys.stream().collect(
                Collectors.toMap(PlanCategory::getCategoryId,PlanCategory::getCategoryName));
		
		return result;
	}

	@Override
	public boolean savePlan(Plan plan) {
		// TODO Auto-generated method stub
		boolean status = false;
		
		int planId = planRepo.save(plan).getPlanId();
		
		if(planId > 0) {
			status = true;
		}
		
		return status;
	}

	@Override
	public List<Plan> getAllPlans() {
		// TODO Auto-generated method stub
		return planRepo.findAll();
	}

	@Override
	public Plan getPlanById(Integer planId) {
		// TODO Auto-generated method stub
		return planRepo.getById(planId);
	}

	@Override
	public boolean updatePlan(Plan plan) {
		// TODO Auto-generated method stub
		
    boolean status = false;
		
		int planId = planRepo.save(plan).getPlanId();
		
		if(planId > 0) {
			status = true;
		}
		
		return status;
	}

	@Override
	public boolean deletePlanById(Integer planId) {
		// TODO Auto-generated method stub
		boolean status = false;
		try {
		planRepo.deleteById(planId);
		status = true;
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public boolean planStatusChange(Integer planId, String status) {
		// TODO Auto-generated method stub
		boolean succss = false;
		Plan plan = planRepo.getById(planId);
		plan.setActiveSw(status);
		
        int id = planRepo.save(plan).getPlanId();
		
		if(planId > 0) {
			succss = true;
		}
		
		return succss;
		
	}

}
