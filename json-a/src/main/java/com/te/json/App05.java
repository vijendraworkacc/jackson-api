package com.te.json;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.te.json.beans.Student;

public class App05 {

	/*
	 * Jackson
	 * 
	 * De-Serialization / Un-Marshaling
	 * 
	 */

	public static void main(String[] args) throws IOException {
		System.out.println("Hello World!");

		ObjectMapper mapper = new ObjectMapper();
		Student student = mapper.readValue(new File("example.json"), Student.class);
		System.out.println(student);
	}
}
