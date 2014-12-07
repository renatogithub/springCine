package controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class NavegaController {
	
	@RequestMapping(value="saludo",method = RequestMethod.GET)
	public String saludo(ModelMap model) {
	  model.addAttribute("message", "Esto es una prueba que Spring Funciona Bien!");
	  return "mensaje";
	}
	
	@RequestMapping(value="inicio",method = RequestMethod.GET)
	public String inicio() {	  
	  return "inicio";
	}
	
}
