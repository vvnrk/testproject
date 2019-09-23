package com.bank.clientscreening.domain.account;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Table(name = "<TABLE NAME>")
public class MasterAccounts {
	
	@Column(name = "", insertable=false, updatable=false)
	private Integer sortCode;
	
	@Column(name = "", insertable=false, updatable=false)
	private Long accountNumber;
	
	@Column(name = "", insertable=false, updatable=false)
	private String accountLastName;
	
	@Column(name = "", insertable=false, updatable=false)
	private String accountFirstName;
	
	@Column(name = "", insertable=false, updatable=false)
	private Date dob;
	
	@Column(name = "", insertable=false, updatable=false)
	private Double amount;
	
	@Column(name = "", insertable=false, updatable=false)
	private String notes;
	
	public Integer getSortCode() {
		return sortCode;
	}

	public void setSortCode(Integer sortCode) {
		this.sortCode = sortCode;
	}

	public Long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountLastName() {
		return accountLastName;
	}

	public void setAccountLastName(String accountLastName) {
		this.accountLastName = accountLastName;
	}

	public String getAccountFirstName() {
		return accountFirstName;
	}

	public void setAccountFirstName(String accountFirstName) {
		this.accountFirstName = accountFirstName;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}


}
