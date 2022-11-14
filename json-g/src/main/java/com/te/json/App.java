package com.te.json;

import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.te.json.beans.Address;
import com.te.json.beans.Student;

public class App {

	/*
	 * Jackson
	 * 
	 * Serialization / Marshaling
	 * 
	 * @JsonProperty, @JsonInclude(value = Include.NON_EMPTY)
	 * 
	 * ---------
	 * @JsonValue
	 * @JsonAnyGetter
	 * @JsonAnySetter
	 * 
	 */

	public static void main(String[] args) throws JsonProcessingException {
		System.out.println("Hello World!");

		 Address address = new Address(212, "Address line 01");

		Set<String> set = new HashSet<String>();
		set.add("Maths");
		set.add("History");
		set.add("English");
		set.add("Hindi");

		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("Math", 77);
		map.put("History", 98);
		map.put("English", 78);

		Date date = new Date();
		
		Student student = new Student(1, "Name 01", 12, 9876543L, "Father 01", "Mother 01", set, map, date, address);

		ObjectMapper mapper = new ObjectMapper();
		String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(student);
		System.out.println(json);
	}
}
