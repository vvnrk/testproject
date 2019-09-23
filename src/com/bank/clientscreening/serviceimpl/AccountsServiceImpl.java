package com.bank.clientscreening.serviceimpl;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.bank.clientscreening.domain.account.AccountsToCheck;
import com.bank.clientscreening.domain.account.MasterAccounts;
import com.bank.clientscreening.repository.account.AccountsToCheckRepository;
import com.bank.clientscreening.repository.account.MasterAccountsRepository;
import com.bank.clientscreening.service.AccountsService;
import com.bank.clientscreening.util.DateUtil;

public class AccountsServiceImpl implements AccountsService {
	
	@Autowired
	AccountsToCheckRepository accountsToCheckRepo;
	
	@Autowired
	MasterAccountsRepository masterAccountsRepo;

	@Override
	public List<AccountsToCheck> checkAccountsAndUpdate() {		
		//Please Yesterday's date to get today's records
		Date date = new Date(DateUtil.getYesterdayDate().getTime());
		List<AccountsToCheck> accounts = accountsToCheckRepo.findAllByIngestedDate(date);
		List<AccountsToCheck> updateAccounts = new ArrayList<>();
		for(AccountsToCheck account : accounts) {			
			MasterAccounts ma = masterAccountsRepo.getRecordBySortCodeAndAccountNumber(account.getSortCode(), account.getAccountNumber());
			if(ma != null) {
				if(ma.getAmount() != account.getAmount()) {
					updateAccounts.add(account);
				}
			}
		}
		return updateAccounts;		
	}
	
	@Override
	public void updateAccounts(List<AccountsToCheck> accounts) {
		
		for(AccountsToCheck account : accounts) {
			AccountsToCheck existingAccount = accountsToCheckRepo.findBySortCodeAndAccountNumber(account.getSortCode(),account.getAccountNumber(),account.getInjestedDate());
			existingAccount.setChecked (true);
			existingAccount.setDateChecked(new Date(new java.util.Date().getTime()));
			existingAccount.onUpdate();
			accountsToCheckRepo.save(existingAccount);
		}
	}
}
