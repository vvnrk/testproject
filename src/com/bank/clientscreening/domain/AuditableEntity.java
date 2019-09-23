package com.bank.clientscreening.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;

import com.bank.clientscreening.domain.user.CurrentUser;

	@MappedSuperclass
	public class AuditableEntity<K> extends Entity<K> {

	    /**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		@Column(name = "CreatedTime")
	    public Date createdTime;

	    @Column(name = "UpdatedTime")
	    public Date updatedTime;

	    @Column(name = "CreatedBy")
	    public String createdBy;

	    @Column(name = "UpdatedBy")
	    public String updatedBy;

	    @PrePersist
	    public void onCreate() {
	        createdBy = CurrentUser.getUsername();
	        createdTime = new Date();
	    }

	    public void onUpdate() {
	        updatedBy = CurrentUser.getUsername();
	        updatedTime = new Date();
	    }

}
