package br.com.bepid.ibm.managedBean;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "tradutorMB")
public class Tradutor {
	private String texto;
	private String textoTraduzido;
	
	
	
	public Tradutor(){
		
		
	}
	
	
	public void traduzirTexto(){
		
		setTextoTraduzido(getTexto().toUpperCase());
	}
	
	
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public String getTextoTraduzido() {
		return textoTraduzido;
	}
	public void setTextoTraduzido(String textoTraduzido) {
		this.textoTraduzido = textoTraduzido;
	}
	
	
	
}
