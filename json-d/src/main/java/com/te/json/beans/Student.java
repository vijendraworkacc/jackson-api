package com.te.json.beans;

import java.util.Map;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"s_fn", "s_mn", "s_name"})
public class Student {
	
	@JsonProperty(value = "s_id")
	private int sId;
	
	@JsonProperty(value = "s_name")
	private String sName;
	
	@JsonProperty(value = "s_age")
	private int sAge;
	
	@JsonProperty(value = "s_number")
	private long sNumber;
	
	@JsonProperty(value = "s_fn")
	private String sFatherName;
	
	@JsonProperty(value = "s_mn")
	private String sMotherName;
	
	@JsonProperty(value = "s_subject")
	private Set<String> sSubjects;
	
	@JsonProperty(value = "s_marks")
	private Map<String, Integer> sSubjectMarks;
	
	private Address address;

	public Student() {
		super();
	}

	public Student(int sId, String sName, int sAge, long sNumber, String sFatherName, String sMotherName,
			Set<String> sSubjects, Map<String, Integer> sSubjectMarks, Address address) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.sAge = sAge;
		this.sNumber = sNumber;
		this.sFatherName = sFatherName;
		this.sMotherName = sMotherName;
		this.sSubjects = sSubjects;
		this.sSubjectMarks = sSubjectMarks;
		this.address = address;
	}

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public int getsAge() {
		return sAge;
	}

	public void setsAge(int sAge) {
		this.sAge = sAge;
	}

	public long getsNumber() {
		return sNumber;
	}

	public void setsNumber(long sNumber) {
		this.sNumber = sNumber;
	}

	public String getsFatherName() {
		return sFatherName;
	}

	public void setsFatherName(String sFatherName) {
		this.sFatherName = sFatherName;
	}

	public String getsMotherName() {
		return sMotherName;
	}

	public void setsMotherName(String sMotherName) {
		this.sMotherName = sMotherName;
	}

	public Set<String> getsSubjects() {
		return sSubjects;
	}

	public void setsSubjects(Set<String> sSubjects) {
		this.sSubjects = sSubjects;
	}

	public Map<String, Integer> getsSubjectMarks() {
		return sSubjectMarks;
	}

	public void setsSubjectMarks(Map<String, Integer> sSubjectMarks) {
		this.sSubjectMarks = sSubjectMarks;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", sAge=" + sAge + ", sNumber=" + sNumber + ", sFatherName="
				+ sFatherName + ", sMotherName=" + sMotherName + ", sSubjects=" + sSubjects + ", sSubjectMarks="
				+ sSubjectMarks + "]";
	}

}
