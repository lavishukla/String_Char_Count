package com.nt.bindings;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@XmlRootElement
@Data
public class Student {

	private Integer id;
	private String name;
	private Integer rank;
}
