package com.nt.binding;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="USER_DETAILS")
public class User {

	@Id
	@GeneratedValue
	private Integer id;
	private String uname;
	private String email;
	private Long phno;
}
