package com.ratcoding.views.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ratcoding.views.domain.Person;

@Controller
public class AppController {

	@RequestMapping(value = "/test/{personName}", method = RequestMethod.GET)
	public String getPizza(@PathVariable String personName, ModelMap model) {
		Person person = new Person(personName);
		model.addAttribute("person", person);

		return "person";

	}
}
