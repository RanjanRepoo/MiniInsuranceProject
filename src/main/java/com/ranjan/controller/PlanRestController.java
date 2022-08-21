package com.ranjan.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ranjan.entity.Plan;
import com.ranjan.service.PlanService;

@RestController
public class PlanRestController {
	
	@Autowired
	PlanService planService;
	
	
	@GetMapping("/getPlanCategories")
	public ResponseEntity<Map<Integer, String>> getCategories() {
		return new ResponseEntity<Map<Integer,String>>(planService.getCategories(), HttpStatus.OK);
	}
	
	@GetMapping("/getPlans")
	public ResponseEntity<List<Plan>> getAllPlans() {
		return new ResponseEntity<List<Plan>>(planService.getAllPlans(), HttpStatus.OK);
	}
	
	@PostMapping("/savePlan")
	public ResponseEntity<String> savePlan(@RequestBody Plan plan) {
		String msg = null;
		boolean status =  planService.savePlan(plan);
		
		if(status) {
			msg = "plan saved";
		}else {
		msg = "plan not saved";
		}
		return new ResponseEntity<String>(msg, HttpStatus.CREATED);
	}
	
	@GetMapping("/getPlanById/{planId}")
	public ResponseEntity<Plan> getPlanById(@PathVariable Integer planId) {
		return new ResponseEntity<Plan>(planService.getPlanById(planId), HttpStatus.OK);
	}
	
	@PutMapping("/updatePlan")
	public ResponseEntity<String> updatePlan(@RequestBody Plan plan) {
		String msg = null;
		boolean status =  planService.updatePlan(plan);
		
		if(status) {
			msg = "plan Updated";
		}else {
		msg = "plan not Updated";
		}
		return new ResponseEntity<String>(msg, HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteById/{planId}")
	public ResponseEntity<String> deletePlanById(@PathVariable Integer planId) {
		String msg = null;
		boolean status =  planService.deletePlanById(planId);
		
		if(status) {
			msg = "plan deleted";
		}else {
		msg = "plan not deleted";
		}
		return new ResponseEntity<String>(msg, HttpStatus.OK);
	}
	
	@PutMapping("/activatePlan/{planId}/{status}")
	public ResponseEntity<String> planStatusChange(@PathVariable Integer planId,@PathVariable  String status) {
		String msg = null;
		boolean active =  planService.planStatusChange(planId,status);
		
		if(active) {
			msg = "plan Activated";
		}else {
		msg = "plan Deactivated";
		}
		return new ResponseEntity<String>(msg, HttpStatus.OK);
	}

}
