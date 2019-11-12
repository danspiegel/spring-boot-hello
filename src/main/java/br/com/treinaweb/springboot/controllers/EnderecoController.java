package br.com.treinaweb.springboot.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.treinaweb.springboot.entidades.Endereco;
import br.com.treinaweb.springboot.entidades.FiltroCep;
import br.com.treinaweb.springboot.service.EnderecoService;

@RestController
@RequestMapping(value = "/enderecos")
public class EnderecoController {

	@Autowired
	private EnderecoService enderecoService;
	
	@GetMapping(value = "/buscarEndereco/{cep}")
	public ResponseEntity<Object> buscarEndereco(@PathVariable String cep) {
		Endereco endereco = enderecoService.buscarEndereco(cep);
		return ResponseEntity.ok().body(endereco);
	}
	
	@PostMapping(value = "/buscarEnderecoJson")
	public ResponseEntity<Object> buscarEnderecoJson(@Valid @RequestBody FiltroCep filtroCep) {
		Endereco endereco = enderecoService.buscarEnderecoJson(filtroCep);
		return ResponseEntity.ok().body(endereco);
	}
	
}
