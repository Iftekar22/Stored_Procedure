package com.storedProcedure.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.storedProcedure.dao.LoanDAO;
import com.storedProcedure.dbUtill.DBConnection;
import com.storedProcedure.model.Branch;
import com.storedProcedure.model.Loan;

public class LoanDAOImplement implements LoanDAO {
	
	DBConnection c=new DBConnection();
	Connection conn=c.createConnection();
	
	public List<Loan> AllBranchNameWithLoanRelation()
	{
		
		
			Statement st = null;
			ResultSet res = null;
			
			try {
				String qry = "G4_AllBranchNameWithLoanRelation";
				//myConnect.prepareCall("{CALL sp_emps_in_dept(?)}")
				st = conn.createStatement();
				res = st.executeQuery(qry);
				
				List <Loan> loanList = new ArrayList<Loan>();
				
				while(res.next())
				{
					Loan loan = new Loan();
					loan.setBranchName(res.getString("branch_name"));
					
				//	cus.setCustomerName(res.getString("customer_name"));
					loanList.add(loan);
											
				}
				return loanList;
				
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			
			return null;
		}

}
