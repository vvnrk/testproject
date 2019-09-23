package com.bank.clientscreening.repository.account;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bank.clientscreening.domain.account.AccountsToCheck;

@Transactional
@Repository
public interface AccountsToCheckRepository extends CrudRepository<AccountsToCheck, Long> {

	@Query("select acco from AccountsToCheck where acco.injestedDate > :injestedDate")
	List<AccountsToCheck> findAllByIngestedDate(@Param("injestedDate") Date ingestedDate);
	
	@Query("select acco from AccountsToCheck where acco.sortCode=:sortCode and acco.accountNumber =:accountNumber and acco.injestedDate =:injestedDate")
	AccountsToCheck findBySortCodeAndAccountNumber(@Param("sortCode") Integer sortCode, @Param("accountNumber") Long accountNumber, @Param("injestedDate") Date injestedDate);

}
