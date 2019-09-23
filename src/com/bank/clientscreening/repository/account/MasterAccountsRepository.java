package com.bank.clientscreening.repository.account;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bank.clientscreening.domain.account.MasterAccounts;

@Transactional
@Repository
public interface MasterAccountsRepository extends CrudRepository<MasterAccounts, Long> {
	
	
	@Query("select ma from MasterAccounts ma where ma.sortCode =:sortCode and ma.accountNumber = :accountNumber")
	MasterAccounts getRecordBySortCodeAndAccountNumber(@Param("sortCode") Integer sortCode, @Param("accountNumber")Long accountNumber);
	

}
