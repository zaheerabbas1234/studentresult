package com.student.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Result {
	
	
	@Id
	private String hallticketno;
	private String studentName;
	private String javamMarks;
	private String pythonMarks;
	private String devopsMarks;
	
	
	public Result() {
		super();
	}


	public Result(String hallticketno, String studentName, String javamMarks, String pythonMarks, String devopsMarks) {
		super();
		this.hallticketno = hallticketno;
		this.studentName = studentName;
		this.javamMarks = javamMarks;
		this.pythonMarks = pythonMarks;
		this.devopsMarks = devopsMarks;
	}


	public String getHallticketno() {
		return hallticketno;
	}


	public void setHallticketno(String hallticketno) {
		this.hallticketno = hallticketno;
	}


	public String getStudentName() {
		return studentName;
	}


	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}


	public String getJavamMarks() {
		return javamMarks;
	}


	public void setJavamMarks(String javamMarks) {
		this.javamMarks = javamMarks;
	}


	public String getPythonMarks() {
		return pythonMarks;
	}


	public void setPythonMarks(String pythonMarks) {
		this.pythonMarks = pythonMarks;
	}


	public String getDevopsMarks() {
		return devopsMarks;
	}


	public void setDevopsMarks(String devopsMarks) {
		this.devopsMarks = devopsMarks;
	}


	@Override
	public String toString() {
		return "Result [hallticketno=" + hallticketno + ", studentName=" + studentName + ", javamMarks=" + javamMarks
				+ ", pythonMarks=" + pythonMarks + ", devopsMarks=" + devopsMarks + "]";
	}
	

}
