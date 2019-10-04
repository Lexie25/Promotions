package com.br.zup.helpers;


import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
@AllArgsConstructor
public class DetalhesErro {

	private int status;
	private String mensagem;
	private String origem;
	
	public DetalhesErro( String mensagem, String origem, HttpStatus status) {
		this.status = status.value();
		this.mensagem = mensagem;
		this.origem = origem;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}
}
