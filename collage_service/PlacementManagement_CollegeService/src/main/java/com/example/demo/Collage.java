package com.example.demo;

import java.util.Date;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="Collage_table")
public class Collage {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String address;
	private String accreditation;
	private Date establishedDate;
	
	
	public Collage() {
		
	}
	
	
	public Collage(Long id, String name, String address, String accreditation, Date establishedDate) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.accreditation = accreditation;
		this.establishedDate = establishedDate;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAccreditation() {
		return accreditation;
	}
	public void setAccreditation(String accreditation) {
		this.accreditation = accreditation;
	}
	public Date getEstablishedDate() {
		return establishedDate;
	}
	public void setEstablishedDate(Date establishedDate) {
		this.establishedDate = establishedDate;
	}


	@Override
	public String toString() {
		return "Collage [id=" + id + ", name=" + name + ", address=" + address + ", accreditation=" + accreditation
				+ ", establishedDate=" + establishedDate + "]";
	}
	

}
