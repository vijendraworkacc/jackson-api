package com.te.json.beans;

import java.io.Serializable;

public class Address implements Serializable {
	private int houseNumber;
	private String addressLine;

	public Address() {
		super();
	}

	public Address(int houseNumber, String addressLine) {
		super();
		this.houseNumber = houseNumber;
		this.addressLine = addressLine;
	}

	public int getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}

	public String getAddressLine() {
		return addressLine;
	}

	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}

	@Override
	public String toString() {
		return "Address [houseNumber=" + houseNumber + ", addressLine=" + addressLine + "]";
	}
}
