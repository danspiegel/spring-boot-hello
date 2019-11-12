package br.com.treinaweb.springboot.exceptions;

import java.io.Serializable;

public class ErroCampos implements Serializable {

	private static final long serialVersionUID = 341769165312263222L;
	
	private String campo;
	private String mensagem;
	
	public ErroCampos() {
		
	}
	
	public ErroCampos(String campo, String mensagem) {
		super();
		this.campo = campo;
		this.mensagem = mensagem;
		
	}
	
	public String getCampo() {
		return campo;
	}
	public void setCampo(String campo) {
		this.campo = campo;
	}
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

}
