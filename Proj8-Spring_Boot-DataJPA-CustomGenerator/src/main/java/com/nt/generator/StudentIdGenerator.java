package com.nt.generator;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class StudentIdGenerator implements IdentifierGenerator{

	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
		String prefix = "STUD";
		String suffix = "";
		try {
			Connection con = session.connection();
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery("select student_id_seq.nextval from dual") ;
			if(rs.next()) {
				int val = rs.getInt(1);
				suffix = String.valueOf(val);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return prefix+suffix;
	}

}
