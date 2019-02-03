package com.storedProcedure.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.storedProcedure.dao.BranchDAO;
import com.storedProcedure.dbUtill.DBConnection;
import com.storedProcedure.model.Branch;
import com.storedProcedure.model.Customer;

public class BranchDAOImplemant implements BranchDAO {
	
	DBConnection c=new DBConnection();
	Connection conn=c.createConnection();
	
	public List<Branch> DisplayEntireBranch()
	{
		
		
			Statement st = null;
			ResultSet res = null;
			
			try {
				String qry = "G4_DisplayEntireBranch";
				//myConnect.prepareCall("{CALL sp_emps_in_dept(?)}")
				st = conn.createStatement();
				res = st.executeQuery(qry);
				
				List <Branch> brList = new ArrayList<Branch>();
				
				while(res.next())
				{
					Branch br = new Branch();
					
					br.setBranchName(res.getString("branch_name"));
					br.setBranchCity(res.getString("branch_city"));
					br.setAssets(res.getFloat("assets"));
					
					
					
				//	cus.setCustomerName(res.getString("customer_name"));
					brList.add(br);
											
				}
				return brList;
				
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			
			return null;
		}
	
	public List<Branch> G4_BranchNameAndAssetsFromAllBranchesInThousandsOfDollarsAndRenameAssetsColumnToAssetsInThousands ()

	{
		
		
			Statement st = null;
			ResultSet res = null;
			
			try {
				String qry = "G4_BranchNameAndAssetsFromAllBranchesInThousandsOfDollarsAndRenameAssetsColumnToAssetsInThousands\r\n" + 
						"";
				//myConnect.prepareCall("{CALL sp_emps_in_dept(?)}")
				st = conn.createStatement();
				res = st.executeQuery(qry);
				
				List <Branch> brList = new ArrayList<Branch>();
				
				while(res.next())
				{
					Branch br = new Branch();
					
					br.setBranchName(res.getString("branch_name"));
			
					br.setAssets(res.getFloat("assets in thousands"));
					
					
					
				//	cus.setCustomerName(res.getString("customer_name"));
					brList.add(br);
											
				}
				return brList;
				
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			
			return null;
		}
	
	public List<Branch> G4_NameOfAllBranchesWithAssetsBetweenOneAndFourMillionDollars()
	{
		
		
			Statement st = null;
			ResultSet res = null;
			
			try {
				String qry = "G4_NameOfAllBranchesWithAssetsBetweenOneAndFourMillionDollars";
				//myConnect.prepareCall("{CALL sp_emps_in_dept(?)}")
				st = conn.createStatement();
				res = st.executeQuery(qry);
				
				List <Branch> brList = new ArrayList<Branch>();
				
				while(res.next())
				{
					Branch br = new Branch();
					
					br.setBranchName(res.getString("branch_name"));
				
					
					
					
				//	cus.setCustomerName(res.getString("customer_name"));
					brList.add(br);
											
				}
				return brList;
				
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			
			return null;
		}
	
	

}
