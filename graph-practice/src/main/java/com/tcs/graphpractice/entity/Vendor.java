package com.tcs.graphpractice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Vendor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long vendorId;
    private String vendorName;
    private String vendorCity;
    private String vendorAddress;
    private String vendorPhone;
    private String vendorEmail;
    private String vendorType;
    private Double vendorRating;
    private String vendorStatus;
    private String vendorContactPerson;
    private String vendorWebsite;

    // Default constructor
    public Vendor() {}

    // Parameterized constructor
    public Vendor(Long vendorId, String vendorName, String vendorCity) {
        this.vendorId = vendorId;
        this.vendorName = vendorName;
        this.vendorCity = vendorCity;
    }

    // Getters and setters
    public Long getVendorId() {
        return vendorId;
    }

    public void setVendorId(Long vendorId) {
        this.vendorId = vendorId;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getVendorCity() {
        return vendorCity;
    }

    public void setVendorCity(String vendorCity) {
        this.vendorCity = vendorCity;
    }

	public Vendor(Long vendorId, String vendorName, String vendorCity, String vendorAddress, String vendorPhone,
			String vendorEmail, String vendorType, Double vendorRating, String vendorStatus, String vendorContactPerson,
			String vendorWebsite) {
		super();
		this.vendorId = vendorId;
		this.vendorName = vendorName;
		this.vendorCity = vendorCity;
		this.vendorAddress = vendorAddress;
		this.vendorPhone = vendorPhone;
		this.vendorEmail = vendorEmail;
		this.vendorType = vendorType;
		this.vendorRating = vendorRating;
		this.vendorStatus = vendorStatus;
		this.vendorContactPerson = vendorContactPerson;
		this.vendorWebsite = vendorWebsite;
	}

	public String getVendorAddress() {
		return vendorAddress;
	}

	public void setVendorAddress(String vendorAddress) {
		this.vendorAddress = vendorAddress;
	}

	public String getVendorPhone() {
		return vendorPhone;
	}

	public void setVendorPhone(String vendorPhone) {
		this.vendorPhone = vendorPhone;
	}

	public String getVendorEmail() {
		return vendorEmail;
	}

	public void setVendorEmail(String vendorEmail) {
		this.vendorEmail = vendorEmail;
	}

	public String getVendorType() {
		return vendorType;
	}

	public void setVendorType(String vendorType) {
		this.vendorType = vendorType;
	}

	public Double getVendorRating() {
		return vendorRating;
	}

	public void setVendorRating(Double vendorRating) {
		this.vendorRating = vendorRating;
	}

	public String getVendorStatus() {
		return vendorStatus;
	}

	public void setVendorStatus(String vendorStatus) {
		this.vendorStatus = vendorStatus;
	}

	public String getVendorContactPerson() {
		return vendorContactPerson;
	}

	public void setVendorContactPerson(String vendorContactPerson) {
		this.vendorContactPerson = vendorContactPerson;
	}

	public String getVendorWebsite() {
		return vendorWebsite;
	}

	public void setVendorWebsite(String vendorWebsite) {
		this.vendorWebsite = vendorWebsite;
	}
}