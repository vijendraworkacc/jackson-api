package com.te.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.te.json.beans.Student;

public class App02 {
	
	/* 
	 * Jackson 
	 * 
	 * De-Serialization / Un-Marshaling 
	 * 
	 * */
	
	public static void main(String[] args) throws JsonProcessingException {
		System.out.println("Hello World!");
		
		String source = "{\r\n" + 
						"  \"sId\" : 1,\r\n" + 
						"  \"sName\" : \"Name 01\",\r\n" + 
						"  \"sAge\" : 12,\r\n" + 
						"  \"sNumber\" : 9876543,\r\n" + 
						"  \"sFatherName\" : \"Father 01\",\r\n" + 
						"  \"sMotherName\" : \"Mother 01\",\r\n" + 
						"  \"sSubjects\" : [ \"Maths\", \"English\", \"Hindi\", \"History\" ],\r\n" + 
						"  \"sSubjectMarks\" : {\r\n" + 
						"    \"English\" : 78,\r\n" + 
						"    \"Math\" : 77,\r\n" + 
						"    \"History\" : 98\r\n" + 
						"  }\r\n" + 
						"}";
		
		
		ObjectMapper mapper = new ObjectMapper();
		Student student = mapper.readValue(source, Student.class);
		System.out.println(student);
		
	}
}
