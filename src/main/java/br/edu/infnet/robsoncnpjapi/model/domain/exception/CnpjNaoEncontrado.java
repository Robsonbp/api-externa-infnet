package br.edu.infnet.robsoncnpjapi.model.domain.exception;

public class CnpjNaoEncontrado extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public CnpjNaoEncontrado (String mensagem) {
		super(mensagem);
	}
}
