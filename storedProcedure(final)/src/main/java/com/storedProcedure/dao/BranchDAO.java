package com.storedProcedure.dao;

import java.util.List;

import com.storedProcedure.model.Branch;


public interface BranchDAO {
	
	public List<Branch> DisplayEntireBranch();
	
	public List<Branch>G4_BranchNameAndAssetsFromAllBranchesInThousandsOfDollarsAndRenameAssetsColumnToAssetsInThousands ();
	
	public List<Branch> G4_NameOfAllBranchesWithAssetsBetweenOneAndFourMillionDollars();

}
