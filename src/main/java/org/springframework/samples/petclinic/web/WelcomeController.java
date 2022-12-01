package org.springframework.samples.petclinic.web;

import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.model.Person;
import org.springframework.samples.petclinic.tablero.TableroService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {

	@Autowired
	TableroService tableroService;
	
	@GetMapping({"/","/welcome"})
	public String welcome(Map<String, Object> model, HttpServletResponse response) {	
		
	List<Person> personas = new ArrayList<Person>();

	// Nombre, proyecto y grupo.
	Person persona = new Person();
	persona.setFirstName("Adrian");
	persona.setLastName("Garcia");
	personas.add(persona);
	model.put("persons", personas);
	model.put("title", "Buscaminas");
	model.put("group", "L8-6");

	// Auto-refresco
	// response.addHeader("Refresh", "1");
	// model.put("now", new Date());
	model.put("tablero", tableroService.findById(1).get());
	
	return "welcome";
	}
}
