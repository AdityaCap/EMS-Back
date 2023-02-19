package com.bootapp.rest.restapp.model;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="attendance")
public class Attendance {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private int a_id;
	
	@Column(name="emp_id")
	private int emp_id;
	
	@Column(name = "emp_name")
	private String name;
	
	@Column(name = "date")
	private LocalDate date;
	
	@Column(name = "time")
	private LocalTime time;

	@Column(name = "branch")
	private String branch;
	
	
	@Column(name = "designation")
	private String designation;
	
	@Column(name = "availability")
	private String availability;

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public LocalTime getTime() {
		return time;
	}

	public void setTime(LocalTime time) {
		this.time = time;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getAvailability() {
		return availability;
	}

	public void setAvailability(String availability) {
		this.availability = availability;
	}

	@Override
	public String toString() {
		return "DailyAttendance [a_id=" + a_id + ", emp_id=" + emp_id + ", name=" + name + ", date=" + date + ", time="
				+ time + ", branch=" + branch + ", designation=" + designation + ", availability=" + availability + "]";
	}

	public Attendance(int a_id, int emp_id, String name, LocalDate date, LocalTime time, String branch,
			String designation, String availability) {
		super();
		this.a_id = a_id;
		this.emp_id = emp_id;
		this.name = name;
		this.date = date;
		this.time = time;
		this.branch = branch;
		this.designation = designation;
		this.availability = availability;
	}
	

	

}
