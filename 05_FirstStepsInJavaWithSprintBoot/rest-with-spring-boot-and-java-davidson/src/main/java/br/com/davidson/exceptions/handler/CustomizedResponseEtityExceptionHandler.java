package br.com.davidson.exceptions.handler;



import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import br.com.davidson.exceptions.ExceptionResponse;
import br.com.davidson.exceptions.UnsupportedMathOperationException;

@ControllerAdvice /*Usamos essa anotation quando precisamos concentrar algum tratamento que seria espalhado em todos os controles. Toda vez que o controller lançar uma exceção mais generica,
vai cair no controller global do "controllerAdvice.*/
@RestControllerAdvice /*O Spring consegue mapear uma requisição especifica para um método especifico através de um “@RequestMapping”.*/
public class CustomizedResponseEtityExceptionHandler extends ResponseEntityExceptionHandler{

	@ExceptionHandler(Exception.class)
	public final ResponseEntity<ExceptionResponse> handleAllExceptions (Exception ex, WebRequest request){
		
		/*Vai retornar nossa exceção customizada*/
		ExceptionResponse exceptionRespose = new ExceptionResponse (
				new Date(), /* vai trazer a data da exceção*/
				ex.getMessage(), /*Vai retornar a menssagem do erro*/
				request.getDescription(false)); 
		
		return new ResponseEntity<>(exceptionRespose, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	@ExceptionHandler(UnsupportedMathOperationException.class)
	public final ResponseEntity<ExceptionResponse> handleBedRequestExceptions (Exception ex, WebRequest request){
		
		/*Vai retornar nossa exceção customizada*/
		ExceptionResponse exceptionRespose = new ExceptionResponse (
				new Date(), /* vai trazer a data da exceção*/
				ex.getMessage(), /*Vai retornar a menssagem do erro*/
				request.getDescription(false)); 
		
		return new ResponseEntity<>(exceptionRespose, HttpStatus.BAD_REQUEST);
	}
	
}
