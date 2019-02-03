package com.storedProcedure.dbUtill;

import java.sql.Connection;
import java.util.List;

import com.storedProcedure.dao.AccountDAO;
import com.storedProcedure.dao.BranchDAO;
import com.storedProcedure.dao.CustomerDAO;
import com.storedProcedure.dao.LoanDAO;
import com.storedProcedure.model.Account;
import com.storedProcedure.model.Branch;
import com.storedProcedure.model.Customer;
import com.storedProcedure.model.Loan;
import com.storedProcedure.service.AccountDAOImplement;
import com.storedProcedure.service.BranchDAOImplemant;
import com.storedProcedure.service.CustomerDAOImplement;
import com.storedProcedure.service.LoanDAOImplement;

public class DBOperation {
	
	public static void main(String[] args) {
		
		DBConnection c=new DBConnection();
		Connection conn=c.createConnection();
		
		Customer cus=new Customer();
		CustomerDAO cusDao=new CustomerDAOImplement();
		
		Loan loan=new Loan();
		LoanDAO loanDao=new LoanDAOImplement();
		
		Branch br=new Branch();
		BranchDAO brDao=new BranchDAOImplemant();
		
		Account acc=new Account();
		AccountDAO accDao= new AccountDAOImplement();
		
		
		//question 01
		cusDao.getCustomer();
		
		for(Customer emp2 : cusDao.getCustomer() )
		{
			System.out.println(emp2.getCustomerName()+"\n\n");
		}
		
		//question 02
		
		loanDao.AllBranchNameWithLoanRelation();
		
		for(Loan emp2 : loanDao.AllBranchNameWithLoanRelation() )
		{
			System.out.println(emp2.getBranchName()+"\n\n");
		}
		
		//question 03
		
		brDao.DisplayEntireBranch();
		
		
		for(Branch emp2 : brDao.DisplayEntireBranch() )
		{
			System.out.println(emp2.getBranchName()+"\t\t\t"+emp2.getBranchCity()+"\t\t\t"+emp2.getAssets()+"\n\n");
		}
		

		
//question 04
		
	accDao.G4_AllAccountsWhereBalanceGreaterThan$700();
		
		for(Account emp2 : accDao.G4_AllAccountsWhereBalanceGreaterThan$700() )
		{
			System.out.println(emp2.getAccountNumber()+"\n\n");
		}
		
		//question 05
		
        accDao.AccountNumberAndBalanceFromBrightonWhereBalanceGreaterThan$800();
		
		for(Account emp1 : accDao.AccountNumberAndBalanceFromBrightonWhereBalanceGreaterThan$800() )
		{
			System.out.println(emp1.getAccountNumber()+"\t\t\t"+emp1.getBalance()+"\t\t\t"+"\n\n");
		}
//		
//question 06
		
 		brDao.G4_BranchNameAndAssetsFromAllBranchesInThousandsOfDollarsAndRenameAssetsColumnToAssetsInThousands();
//		
//		
		for(Branch emp2 : brDao.G4_BranchNameAndAssetsFromAllBranchesInThousandsOfDollarsAndRenameAssetsColumnToAssetsInThousands() )
		{
			System.out.println(emp2.getBranchName()+"\t\t\t"+emp2.getAssets()+"\n\n");
		}
		
		//question 07
		
		
         brDao.G4_NameOfAllBranchesWithAssetsBetweenOneAndFourMillionDollars();
//		
//		
		for(Branch emp2 : brDao.G4_NameOfAllBranchesWithAssetsBetweenOneAndFourMillionDollars())
		{
			System.out.println(emp2.getBranchName()+"\n\n");
		}
		
		//question 08
		
		accDao.G4_NameAccountNumberAndBalanceOfAllCustomersWhoHaveAnAccount();
			
			for(Account emp2 : accDao.G4_NameAccountNumberAndBalanceOfAllCustomersWhoHaveAnAccount() )
			{
				System.out.println(emp2.getAccountNumber()+"\t\t\t"+emp2.getBalance()+"\t\t\t"+emp2.getCustomerName()+"\n\n");
			}
		
//question 09
		
		accDao.G4_GetNameAccountNumberAndBalanceOfAllCustomersWhoHaveAnAccountWithBalanceOf$400OrLess();
			
			for(Account emp2 : accDao.G4_GetNameAccountNumberAndBalanceOfAllCustomersWhoHaveAnAccountWithBalanceOf$400OrLess() )
			{
				System.out.println(emp2.getAccountNumber()+"\t\t\t"+emp2.getBalance()+"\t\t\t"+emp2.getCustomerName()+"\n\n");
			}
		
		
		
	

	}

}
