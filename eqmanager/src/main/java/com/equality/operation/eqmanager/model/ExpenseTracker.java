package com.equality.operation.eqmanager.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "EXPENSE_TRACKER")
@SequenceGenerator(name = "eid_seq",initialValue = 1001)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExpenseTracker {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column
	private int eid;
	@Column
	private String category;
	@Column
	private String eq_branch;
	@Column
	private String comments;
	@Column
	private int amount;
	@Column
	private String date_of_purchase;
	@Column
	private String inserted_at;
	@Column
	private String created_by;
}
