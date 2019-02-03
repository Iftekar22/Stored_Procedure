package com.storedProcedure.dao;

import java.util.List;

import com.storedProcedure.model.Branch;
import com.storedProcedure.model.Loan;

public interface LoanDAO {
	public List<Loan> AllBranchNameWithLoanRelation();

}
