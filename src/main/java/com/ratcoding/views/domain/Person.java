package com.ratcoding.views.domain;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "person")
public class Person {

	private String name;

	private String surname;

	private List<String> age = new ArrayList<String>();

	public Person() {
	}

	public Person(String name) {
		this.name = name;
		this.surname = "testsurname";
		this.age.add("1");
		this.age.add("2");
	}

	public String getName() {
		return name;
	}

	@XmlElement
	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	@XmlElement
	public void setSurname(String surname) {
		this.surname = surname;
	}

	public List<String> getAge() {
		return age;
	}

	@XmlElement
	public void setAge(List<String> age) {
		this.age = age;
	}
}
