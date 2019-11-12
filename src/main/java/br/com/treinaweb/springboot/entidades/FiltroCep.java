package br.com.treinaweb.springboot.entidades;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

public class FiltroCep {

	@NotEmpty(message = "O CEP é obrigatório")
	@Length(min = 8, max = 8, message = "O tamanho do CEP deve ser 8 números sem hífen")
	private String cep;

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}
	
}
