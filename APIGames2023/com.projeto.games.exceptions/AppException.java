package com.projeto.games.exeptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class AppExeption extends ResponseEntityExceptionHandler {
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity handleExceptoin(Exception e) {
		return new ResponseEntity("Um erro foi encontrado ao realizar o método!!!! Verifique se as informações inseridas estão corretas", HttpStatus.BAD_GATEWAY);
		
	}

}
