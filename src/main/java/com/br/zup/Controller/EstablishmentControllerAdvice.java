package com.br.zup.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import com.br.zup.exceptions.EstablishmentNoFoundException;
import com.br.zup.helpers.DetalhesErro;

public class EstablishmentControllerAdvice {

	@ExceptionHandler(EstablishmentNoFoundException.class)
	public ResponseEntity<DetalhesErro> handleEstablishmentNoFoundException(EstablishmentNoFoundException e, WebRequest request){	
		
		DetalhesErro detalhesErro = new DetalhesErro(e.getMessage(),request.getDescription(false),HttpStatus.NOT_FOUND);
		return ResponseEntity.status(detalhesErro.getStatus()).body(detalhesErro);
	}

	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<DetalhesErro> handleMethodArgumentNotValidException(
										MethodArgumentNotValidException e,
										WebRequest request) {
		DetalhesErro detalhesErro = new DetalhesErro(e.getMessage(),request.getDescription(false),HttpStatus.BAD_REQUEST);
		return ResponseEntity.status(detalhesErro.getStatus()).body(detalhesErro);
	}
}