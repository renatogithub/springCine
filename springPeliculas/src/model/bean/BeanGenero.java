package model.bean;

import java.io.Serializable;

public class BeanGenero implements Serializable{
	private String codgenero;
	private String nomgenero;
	
	
	public BeanGenero() {
		super();
	}


	public BeanGenero(String codgenero, String nomgenero) {
		super();
		this.codgenero = codgenero;
		this.nomgenero = nomgenero;
	}


	public String getCodgenero() {
		return codgenero;
	}


	public void setCodgenero(String codgenero) {
		this.codgenero = codgenero;
	}


	public String getNomgenero() {
		return nomgenero;
	}


	public void setNomgenero(String nomgenero) {
		this.nomgenero = nomgenero;
	}
	
	
	
	
	
}
