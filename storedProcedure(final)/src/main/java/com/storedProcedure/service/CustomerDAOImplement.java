package com.storedProcedure.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.storedProcedure.dao.CustomerDAO;
import com.storedProcedure.dbUtill.DBConnection;
import com.storedProcedure.model.Customer;
import com.storedProcedure.model.Customer;

public class CustomerDAOImplement implements CustomerDAO {
	
	
	DBConnection c=new DBConnection();
	Connection conn=c.createConnection();
	
	public List<Customer> getCustomer()
	{
		Statement st = null;
		ResultSet res = null;
		
		try {
			String qry = "G4_AllCustomerName";
			//myConnect.prepareCall("{CALL sp_emps_in_dept(?)}")
			st = conn.createStatement();
			res = st.executeQuery(qry);
			
			List <Customer> cusList = new ArrayList<Customer>();
			
			while(res.next())
			{
				Customer cus = new Customer();
				
				cus.setCustomerName(res.getString("customer_name"));
				cusList.add(cus);
										
			}
			return cusList;
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		return null;
	}

}
