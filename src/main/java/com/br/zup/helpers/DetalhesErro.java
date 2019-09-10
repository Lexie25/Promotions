package com.br.zup.helpers;

import java.util.Date;

import org.springframework.http.HttpStatus;

public class DetalhesErro {

	private Date data;
	private int status;
	private String mensagem;
	private String origem;
	
	public DetalhesErro( String mensagem, String origem, HttpStatus status) {
		this.data = data;
		this.status = status.value();
		this.mensagem = mensagem;
		this.origem = origem;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
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
