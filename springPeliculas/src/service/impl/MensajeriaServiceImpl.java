package service.impl;

import model.bean.BeanGenero;
import service.MensajeriaService;

public class MensajeriaServiceImpl implements MensajeriaService{

	
	public String mensaje(BeanGenero beanGenero) {
		String msg="Cod. Genero:" + beanGenero.getCodgenero() + " - Nombre de Genero:" + beanGenero.getNomgenero();
		return msg;
	}

}
