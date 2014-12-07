package controller;

import model.bean.BeanGenero;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import service.MensajeriaService;
import service.impl.MensajeriaServiceImpl;

@Controller
public class HelloController {
	
	@Autowired
	private MensajeriaService mensajeriaService;


	
	
	//public void setMensajeriaServiceImpl(MensajeriaServiceImpl mensajeriaServiceImpl) {
		//this.mensajeriaServiceImpl = mensajeriaServiceImpl;
//	}




	@RequestMapping(value="titulo",method = RequestMethod.GET)
	public String saludo(@ModelAttribute BeanGenero beanGenero,ModelMap model) {
	  beanGenero.setCodgenero("G01");
	  beanGenero.setNomgenero("Terror");
	  //String msg="prueba";
	  String msg=mensajeriaService.mensaje(beanGenero);
	  model.addAttribute("message", msg);
	  return "mensaje";
	}
	
}
