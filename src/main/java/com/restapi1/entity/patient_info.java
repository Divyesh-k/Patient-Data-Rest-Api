package com.restapi1.entity;

import java.util.Date;

import org.hibernate.annotations.Generated;
import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "patient_info")
public class patient_info {
	
	@Id@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date entrydate;
	
	private String HealthNumber;
	private String email;
	private String fname;
	private String lname;
	private String sex;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date date_of_birth;
	private String phone;
	private String address;
	private boolean marital_status;
	private boolean less_18;
	
	
	
	public patient_info(Date entrydate, String healthNumber, String email, String fname, String lname, String sex,
			Date date_of_birth, String phone, String address, boolean marital_status, boolean less_18) {
		super();
		this.entrydate = entrydate;
		HealthNumber = healthNumber;
		this.email = email;
		this.fname = fname;
		this.lname = lname;
		this.sex = sex;
		this.date_of_birth = date_of_birth;
		this.phone = phone;
		this.address = address;
		this.marital_status = marital_status;
		this.less_18 = less_18;
	}

	public patient_info() {
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}	
	public Date getEntrydate() {
		return entrydate;
	}

	public void setEntrydate(Date entrydate) {
		this.entrydate = entrydate;
	}

	public String getHealthNumber() {
		return HealthNumber;
	}
	public void setHealthNumber(String healthNumber) {
		HealthNumber = healthNumber;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Date getDate_of_birth() {
		return date_of_birth;
	}
	public void setDate_of_birth(Date date_of_birth) {
		this.date_of_birth = date_of_birth;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public boolean isMarital_status() {
		return marital_status;
	}
	public void setMarital_status(boolean marital_status) {
		this.marital_status = marital_status;
	}
	public boolean isLess_18() {
		return less_18;
	}
	public void setLess_18(boolean less_18) {
		this.less_18 = less_18;
	}

	@Override
	public String toString() {
		return "patient_info [id=" + id + ", entrydate=" + entrydate + ", HealthNumber=" + HealthNumber + ", fname="
				+ fname + ", lname=" + lname + ", sex=" + sex + ", date_of_birth=" + date_of_birth + ", phone=" + phone
				+ ", address=" + address + ", marital_status=" + marital_status + ", less_18=" + less_18 + "]";
	}
	
	

}
