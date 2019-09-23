package com.bank.clientscreening.service;

import java.util.List;

import com.bank.clientscreening.domain.account.AccountsToCheck;

public interface AccountsService {
	
	List<AccountsToCheck> checkAccountsAndUpdate();

	void updateAccounts(List<AccountsToCheck> accounts);
}
