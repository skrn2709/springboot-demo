package com.equality.operation.eqmanager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.equality.operation.eqmanager.model.ExpenseTracker;
import com.equality.operation.eqmanager.repository.ExpenseRepository;

@RestController
public class ExpensesController {

	@Autowired
	ExpenseRepository expenseRepo;
	
	@GetMapping("/")
	public String home() {
		return "Equality Manager up and running succesfully";
	}
	@Transactional
	@GetMapping("/expenses")
	public List<ExpenseTracker> getAllExpenses() {
		return expenseRepo.findAll();
	}
	
	
	@Transactional
	@PostMapping("/addExpense")
	public ExpenseTracker addExpense(ExpenseTracker expense) {
		ExpenseTracker obj=expenseRepo.save(expense);
		return obj;
	}
	@Transactional
	@PostMapping("/deleteExpense")
	public String deleteExpense(ExpenseTracker expense) {
		expenseRepo.delete(expense);
		return "deleted expense "+expense.getEid();
	}
	
}
