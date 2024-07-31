package br.com.davidson.controllers;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RestController;

import br.com.davidson.converters.NumberConverter;
import br.com.davidson.exceptions.UnsupportedMathOperationException;
import br.com.davidson.math.SimpleMath;

@RestController
public class MathController {

	private final AtomicLong counter = new AtomicLong();
	
	private SimpleMath math = new SimpleMath();
	
	/*O Spring consegue mapear uma requisição especifica para um método especifico através de um “@RequestMapping”.*/
	@RequestMapping(value = "/sum/{numeberOne}/{numberTwo}", method=RequestMethod.GET)
	public Double sum (		
			/*Essa pathVariable é utilizada para recuparar dados da URL. Permite que o nosso controller lide com URLs parametrizadas*/
			@PathVariable(value = "numeberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo
		) throws Exception {
		
		if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric (numberTwo)){ /*Se não for numeric*/
			throw new UnsupportedMathOperationException ("Please set a numeric value!");
			
		}
		
		return math.sum(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo)); /*Retorna o valor depois de converter para numero chamando os metodos aabaixo*/
	}
	
	
	
	/*O Spring consegue mapear uma requisição especifica para um método especifico através de um “@RequestMapping”.*/
	@RequestMapping(value = "/subtraction/{numeberOne}/{numberTwo}", method=RequestMethod.GET)
	public Double subtraction (		
			/*Essa pathVariable é utilizada para recuparar dados da URL. Permite que o nosso controller lide com URLs parametrizadas*/
			@PathVariable(value = "numeberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo
			) throws Exception {
		
		if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric (numberTwo)){ /*Se não for numeric*/
			throw new UnsupportedMathOperationException ("Please set a numeric value!");
			
		}
		
		return math.subtraction(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo)); /*Retorna o valor depois de converter para numero chamando os metodos aabaixo*/
	}
	
	/*O Spring consegue mapear uma requisição especifica para um método especifico através de um “@RequestMapping”.*/
	@RequestMapping(value = "/multiplication/{numeberOne}/{numberTwo}", method=RequestMethod.GET)
	public Double multiplication (		
			/*Essa pathVariable é utilizada para recuparar dados da URL. Permite que o nosso controller lide com URLs parametrizadas*/
			@PathVariable(value = "numeberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo
			) throws Exception {
		
		if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric (numberTwo)){ /*Se não for numeric*/
			throw new UnsupportedMathOperationException ("Please set a numeric value!");
			
		}
		
		return math.multiplication(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo)); /*Retorna o valor depois de converter para numero chamando os metodos aabaixo*/
	}
	
	
	/*O Spring consegue mapear uma requisição especifica para um método especifico através de um “@RequestMapping”.*/
	@RequestMapping(value = "/division/{numeberOne}/{numberTwo}", method=RequestMethod.GET)
	public Double division (		
			/*Essa pathVariable é utilizada para recuparar dados da URL. Permite que o nosso controller lide com URLs parametrizadas*/
			@PathVariable(value = "numeberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo
			) throws Exception {
		
		if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric (numberTwo)){ /*Se não for numeric*/
			throw new UnsupportedMathOperationException ("Please set a numeric value!");
			
		}
		
		return math.division(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo)); /*Retorna o valor depois de converter para numero chamando os metodos aabaixo*/
	}
	
	/*O Spring consegue mapear uma requisição especifica para um método especifico através de um “@RequestMapping”.*/
	@RequestMapping(value = "/squareRoot/{number}", method=RequestMethod.GET)
	public Double squareRoot (		
			/*Essa pathVariable é utilizada para recuparar dados da URL. Permite que o nosso controller lide com URLs parametrizadas*/
			@PathVariable(value = "number") String number

			) throws Exception {
		
		if (!NumberConverter.isNumeric(number)){ /*Se não for numeric*/
			throw new UnsupportedMathOperationException ("Please set a numeric value!");
			
		}
		
		return math.squareRoot(NumberConverter.convertToDouble(number)); /*Retorna o valor depois de converter para numero chamando os metodos aabaixo*/
	}

	
	
	/*O Spring consegue mapear uma requisição especifica para um método especifico através de um “@RequestMapping”.*/
	@RequestMapping(value = "/media/{numeberOne}/{numberTwo}", method=RequestMethod.GET)
	public Double media (		
			/*Essa pathVariable é utilizada para recuparar dados da URL. Permite que o nosso controller lide com URLs parametrizadas*/
			@PathVariable(value = "numeberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo
		) throws Exception {
		
		if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric (numberTwo)){ /*Se não for numeric*/
			throw new UnsupportedMathOperationException ("Please set a numeric value!");
			
		}
		
		return math.media(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo)); /*Retorna o valor depois de converter para numero chamando os metodos aabaixo*/
	}
	
	
}
	

