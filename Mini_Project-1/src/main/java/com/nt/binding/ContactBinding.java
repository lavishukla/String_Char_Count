package com.nt.binding;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class ContactBinding {

	private Integer contactId;
	
	private String contactName;
	private String emailId;
	private Long contactNo;
	
	private  LocalDateTime createdDate;
	private LocalDateTime updatedDate;
}
