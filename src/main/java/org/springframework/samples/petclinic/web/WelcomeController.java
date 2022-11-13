package org.springframework.samples.petclinic.web;

import java.util.Map;
import java.util.ArrayList;
import java.util.List;

import org.springframework.samples.petclinic.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {
	
	
	  @GetMapping({"/","/welcome"})
	  public String welcome(Map<String, Object> model) {	
		
		List<Person> personas = new ArrayList<Person>();
		Person persona = new Person();
		persona.setFirstName("Adrian");
		persona.setLastName("Garcia");
		personas.add(persona);
		model.put("persons", personas);
		model.put("title", "Buscaminas");
		model.put("group", "L8-6");
	    return "welcome";
	  }
}
