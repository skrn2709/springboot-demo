package com.equality.operation.eqmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.equality.operation.eqmanager.model.ExpenseTracker;

public interface ExpenseRepository extends JpaRepository<ExpenseTracker, Integer> {

}
