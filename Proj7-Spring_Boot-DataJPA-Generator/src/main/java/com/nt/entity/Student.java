package com.nt.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name="STUDENT_INFO")
public class Student {
	
	@Id
	@SequenceGenerator(name="stud_seq", sequenceName = "STUDENT_ID_SEQ",allocationSize = 1)
	@GeneratedValue(generator = "stud_seq")
	@Column(name="STUDENT_ID")
	private int id;
	
	@Column(name="STUDENT_NAME")
	private String name;
	
	@Column(name="STUDENT_CITY")
	private String city;

	@Column(name="CREATED_DATE", updatable = false)
	@CreationTimestamp
	private LocalDateTime createdDate;
	
	@Column(name="UPDATED_DATE", insertable = false)
	@UpdateTimestamp
	private LocalDateTime updatedDate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public LocalDateTime getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(LocalDateTime updatedDate) {
		this.updatedDate = updatedDate;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + ", createdDate=" + createdDate
				+ ", updatedDate=" + updatedDate + "]";
	}
	
}
