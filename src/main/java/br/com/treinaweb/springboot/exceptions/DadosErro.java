package br.com.treinaweb.springboot.exceptions;

import java.io.Serializable;

public class DadosErro implements Serializable {

	private static final long serialVersionUID = 2109588028115627220L;
	private Integer status;
	private String mensagem;
	private Long timeStamp;
	
	public DadosErro(Integer status, String mensagem, Long timeStamp) {
		super();
		this.status = status;
		this.mensagem = mensagem;
		this.timeStamp = timeStamp;
	}
	
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	public Long getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(Long timeStamp) {
		this.timeStamp = timeStamp;
	}

}
