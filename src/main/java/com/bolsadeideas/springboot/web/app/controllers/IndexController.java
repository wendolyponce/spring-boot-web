package com.bolsadeideas.springboot.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //Anotación o decorador componente de spring tipo controllador
@RequestMapping({"/app",""})
public class IndexController {
	
	/**
	 * También se puede utilizar 
	 * @RequestMapping(value = "/index", method = RequestMethod.GET)
	 * Para mapear a mas de una ruta url
	 * @GetMapping({"/index","/","/home"})
	 */
	
	@GetMapping({"/index","/","/home",""})
	public String index(Model model) {
		/* Podemos usar, model, modelmap, map y modelandview
		 */
		model.addAttribute("dato", "Hola mundo");
		return"index";
	}
//	
}
