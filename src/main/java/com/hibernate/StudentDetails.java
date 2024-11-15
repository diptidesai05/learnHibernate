package com.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
//@Table(name="student_details")
public class StudentDetails {
	
	@Id
	//@Column(name="student_id")
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int studentId;
	//@Column(name="student_name")
	private String studentName;
	//@Column(name="student_city")
	private String studentCity;
	
	public StudentDetails() {
		super();
	}

	public StudentDetails(int studentId, String studentName, String studentCity) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentCity = studentCity;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentCity=" + studentCity
				+ "]";
	}
    
}
