package com.te.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.te.json.beans.Address;
import com.te.json.beans.Employee;

public class App03 {

	/*
	 * Jackson
	 * 
	 * Serialization / Marshaling
	 * 
	 */

	public static void main(String[] args) throws JsonProcessingException {
		System.out.println("Hello World!");

		Employee employee = new Employee();
		employee.seteId(1);
		employee.seteName("Name 01");
		employee.setAddress(new Address(22, "Address Line 01"));

		ObjectMapper mapper = new ObjectMapper();
		String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(employee);
		System.out.println(json);

	}
}
