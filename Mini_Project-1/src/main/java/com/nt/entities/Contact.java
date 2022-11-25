package com.nt.entities;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Entity
@Data
@Table(name="CONTACT_INFO")
public class Contact {

	@Id
	@GeneratedValue
	@Column(name="CONTACT_ID")
	private Integer contactId;
	
	@Column(name="CONTACT_NAME")
	private String contactName;
	
	@Column(name="EMAIL_ID")
	private String emailId;
	
	@Column(name="CONTACT_NO")
	private Long contactNo;
	
	@Column(name="CREATED_DATE")
	@CreationTimestamp
	private  LocalDateTime createdDate;
	
	@Column(name="UPDATED_DATE")
	@UpdateTimestamp()
	private LocalDateTime updatedDate;
}
