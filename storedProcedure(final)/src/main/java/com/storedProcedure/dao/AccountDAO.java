package com.storedProcedure.dao;

import java.util.List;
import com.storedProcedure.model.Account;

public interface AccountDAO {
	public List<Account> G4_AllAccountsWhereBalanceGreaterThan$700();
	
	public List<Account> AccountNumberAndBalanceFromBrightonWhereBalanceGreaterThan$800();
	
	public List<Account> G4_NameAccountNumberAndBalanceOfAllCustomersWhoHaveAnAccount();
	
	public List<Account>G4_GetNameAccountNumberAndBalanceOfAllCustomersWhoHaveAnAccountWithBalanceOf$400OrLess();

}
