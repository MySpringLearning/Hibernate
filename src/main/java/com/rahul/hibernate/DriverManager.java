package com.rahul.hibernate;

import java.util.Date;

import org.hibernate.Session;

public class DriverManager {

	public static void main(String[] args) {
		
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		
		Emp emp = new Emp();
		emp.setEmpId(1212);
		emp.setBirth_date(new Date());
		emp.setHire_date(new Date());
		emp.setFirst_name("Rahul");
		emp.setLast_name("Kumar");
		emp.setGender("M");
		session.save(emp);
		
		session.getTransaction().commit();
		

	}

}
