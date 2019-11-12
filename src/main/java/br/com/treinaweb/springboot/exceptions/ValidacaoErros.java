package br.com.treinaweb.springboot.exceptions;

import java.util.ArrayList;
import java.util.List;

public class ValidacaoErros extends DadosErro {

	private static final long serialVersionUID = 483969599663865645L;
	
	private List<ErroCampos> erros = new ArrayList<ErroCampos>();

	public ValidacaoErros(Integer status, String mensagem, Long timeStamp) {
		super(status, mensagem, timeStamp);
	}
	
	public void adicionarErros(String campo, String mensagem) {
		erros.add(new ErroCampos(campo, mensagem));
	}
	
	public List<ErroCampos> getErros() {
		return erros;
	}

	public void setErros(List<ErroCampos> erros) {
		this.erros = erros;
	}

}
