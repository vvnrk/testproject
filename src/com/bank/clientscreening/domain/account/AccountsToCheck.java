package com.bank.clientscreening.domain.account;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.bank.clientscreening.domain.AuditableEntity;

@Entity
@Table(name = "<TABLE NAME>")
public class AccountsToCheck extends AuditableEntity<Long>{
	
	@Column(name = "")
	private Date injestedDate;
	
	@Column(name = "")
	private Integer sortCode;
	
	@Column(name = "")
	private Long accountNumber;
	
	@Column(name ="")
	private String accountName;
	
	@Column(name ="")
	private Date dob;
	
	@Column(name ="")
	private Double amount;
	
	@Column(name ="")
	private String notes;
	
	@Column(name ="")
	private Boolean checked;
	
	@Column(name ="")
	private Date dateChecked;

	public Date getInjestedDate() {
		return injestedDate;
	}

	public void setInjestedDate(Date injestedDate) {
		this.injestedDate = injestedDate;
	}

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

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
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

	public Boolean getChecked() {
		return checked;
	}

	public void setChecked(Boolean checked) {
		this.checked = checked;
	}

	public Date getDateChecked() {
		return dateChecked;
	}

	public void setDateChecked(Date dateChecked) {
		this.dateChecked = dateChecked;
	}

}
