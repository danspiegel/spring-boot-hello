package br.com.treinaweb.springboot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.treinaweb.springboot.entidades.Endereco;
import br.com.treinaweb.springboot.entidades.FiltroCep;
import br.com.treinaweb.springboot.exceptions.ObjectNotFoundException;
import br.com.treinaweb.springboot.service.EnderecoService;

@Service
public class EnderecoServiceImpl implements EnderecoService {

	@Autowired
	private RestTemplate restTemplate;
	
	@Value("http://viacep.com.br/ws/")
	String baseUrl;
	
	public Endereco buscarEndereco(String cep) {
		Endereco endereco = restTemplate.getForObject(baseUrl + cep.replaceAll("[-]", "") + "/json", Endereco.class);
		
		if (endereco.isNull()) {
			throw new ObjectNotFoundException("Nenhum resultado encontrado.");
		}
		
		return endereco;
	}
	
	public Endereco buscarEnderecoJson(FiltroCep filtroCep) {
		Endereco endereco = restTemplate.getForObject(baseUrl + filtroCep.getCep().replaceAll("[-]", "") + "/json", Endereco.class);
		
		if (endereco.isNull()) {
			throw new ObjectNotFoundException("Nenhum resultado encontrado.");
		}
		
		return endereco;
	}
	
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
	   // Do any additional configuration here
	   return builder.build();
	}
	
}
