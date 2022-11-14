package com.te.json.beans;

import java.util.Map;
import java.util.Set;

public class Student {
	private int sId;
	private String sName;
	private int sAge;
	private long sNumber;
	private String sFatherName;
	private String sMotherName;
	private Set<String> sSubjects;
	private Map<String, Integer> sSubjectMarks;

	public Student() {
		super();
	}

	public Student(int sId, String sName, int sAge, long sNumber, String sFatherName, String sMotherName,
			Set<String> sSubjects, Map<String, Integer> sSubjectMarks) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.sAge = sAge;
		this.sNumber = sNumber;
		this.sFatherName = sFatherName;
		this.sMotherName = sMotherName;
		this.sSubjects = sSubjects;
		this.sSubjectMarks = sSubjectMarks;
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

	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", sAge=" + sAge + ", sNumber=" + sNumber + ", sFatherName="
				+ sFatherName + ", sMotherName=" + sMotherName + ", sSubjects=" + sSubjects + ", sSubjectMarks="
				+ sSubjectMarks + "]";
	}

}
