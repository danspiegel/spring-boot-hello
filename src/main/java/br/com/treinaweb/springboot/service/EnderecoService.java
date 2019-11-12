package br.com.treinaweb.springboot.service;

import br.com.treinaweb.springboot.entidades.Endereco;
import br.com.treinaweb.springboot.entidades.FiltroCep;

public interface EnderecoService {

	public Endereco buscarEndereco(String cep);
	
	public Endereco buscarEnderecoJson(FiltroCep filtroCep);
	
}
