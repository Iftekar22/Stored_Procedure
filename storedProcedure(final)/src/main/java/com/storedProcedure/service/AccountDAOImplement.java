package com.storedProcedure.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.storedProcedure.dao.AccountDAO;
import com.storedProcedure.dbUtill.DBConnection;
import com.storedProcedure.model.Account;

public class AccountDAOImplement implements AccountDAO {
	
	DBConnection c=new DBConnection();
	Connection conn=c.createConnection();
	
	public List<Account> G4_AllAccountsWhereBalanceGreaterThan$700()
	{
		Statement st = null;
		ResultSet res = null;
		
		try {
			String qry = "G4_AllAccountsWhereBalanceGreaterThan$700";
			//myConnect.prepareCall("{CALL sp_emps_in_dept(?)}")
			st = conn.createStatement();
			res = st.executeQuery(qry);
			
			List <Account> accList = new ArrayList<Account>();
			
			while(res.next())
			{
				Account acc = new Account();
				acc.setAccountNumber(res.getString("account_number"));
				
				accList.add(acc);						
			}
			return accList;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		return null;
	}
	public List<Account> AccountNumberAndBalanceFromBrightonWhereBalanceGreaterThan$800()
	{
		Statement st = null;
		ResultSet res = null;
		
		try {
			String qry = "G4_AccountNumberAndBalanceFromBrightonWhereBalanceGreaterThan$800";
			//myConnect.prepareCall("{CALL sp_emps_in_dept(?)}")
			st = conn.createStatement();
			res = st.executeQuery(qry);
			
			List <Account> accList = new ArrayList<Account>();
			
			while(res.next())
			{
				Account acc = new Account();
				acc.setAccountNumber(res.getString("account_number"));
				acc.setBalance(res.getFloat("balance"));
				
				accList.add(acc);						
			}
			return accList;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		return null;
	}
	
	public List<Account> G4_NameAccountNumberAndBalanceOfAllCustomersWhoHaveAnAccount()
	{
		Statement st = null;
		ResultSet res = null;
		
		try {
			String qry = "G4_NameAccountNumberAndBalanceOfAllCustomersWhoHaveAnAccount";
			//myConnect.prepareCall("{CALL sp_emps_in_dept(?)}")
			st = conn.createStatement();
			res = st.executeQuery(qry);
			
			List <Account> accList = new ArrayList<Account>();
			
			while(res.next())
			{
				Account acc = new Account();
				acc.setAccountNumber(res.getString("account_number"));
				
				acc.setBalance(res.getFloat("balance"));
				
				acc.setCustomerName(res.getString("customer_name"));
				
				accList.add(acc);						
			}
			return accList;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		return null;
	}
	
	public List<Account> G4_GetNameAccountNumberAndBalanceOfAllCustomersWhoHaveAnAccountWithBalanceOf$400OrLess()
	{
		Statement st = null;
		ResultSet res = null;
		
		try {
			String qry = "G4_GetNameAccountNumberAndBalanceOfAllCustomersWhoHaveAnAccountWithBalanceOf$400OrLess";
			//myConnect.prepareCall("{CALL sp_emps_in_dept(?)}")
			st = conn.createStatement();
			res = st.executeQuery(qry);
			
			List <Account> accList = new ArrayList<Account>();
			
			while(res.next())
			{
				Account acc = new Account();
				acc.setAccountNumber(res.getString("account_number"));
				
				acc.setBalance(res.getFloat("balance"));
				
				acc.setCustomerName(res.getString("customer_name"));
				
				accList.add(acc);						
			}
			return accList;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		return null;
	}
	
	
	

}
