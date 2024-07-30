package br.com.davidson;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RestController;

import br.com.davidson.exceptions.UnsupportedMathOperationException;

@RestController
public class MathController {

	private final AtomicLong counter = new AtomicLong();
	
	/*O Spring consegue mapear uma requisição especifica para um método especifico através de um “@RequestMapping”.*/
	@RequestMapping(value = "/sum/{numeberOne}/{numberTwo}", method=RequestMethod.GET)
	public Double sum (		
			/*Essa pathVariable é utilizada para recuparar dados da URL. Permite que o nosso controller lide com URLs parametrizadas*/
			@PathVariable(value = "numeberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo
		) throws Exception {
		
		if (!isNumeric(numberOne) || !isNumeric (numberTwo)){ /*Se não for numeric*/
			throw new UnsupportedMathOperationException ("Please set a numeric value!");
			
		}
		
		return converToDouble(numberOne) + converToDouble (numberTwo); /*Retorna o valor depois de converter para numero chamando os metodos aabaixo*/
	}

	private Double converToDouble(String strNumber) {
		
		/*Vamos aceitar um numero double com "." ou com ",". Por isso vamos tratar*/
		if (strNumber == null)return 0D;
		
		String number = strNumber.replaceAll (",","."); //Trocando "," por ".", pois a java entende double como "." e não ","
		

		if (isNumeric(number)) return Double.parseDouble(number); /*se number no retorno da função "isNumeric" e já convertido (pois a variavel number inicialmente é string)
		é numerico, converte a string para double*/
		
		return 0D;
	}

	private boolean isNumeric (String strNumber) {
		
		/*Vamos aceitar um numero double com "." ou com ",". Por isso vamos tratar*/
		if (strNumber == null) return false;
		
		String number = strNumber.replaceAll (",","."); //Trocando "," por ".", pois a java entende double como "." e não ","
	
		return number.matches("[-+]?[0-9]*\\.?[0-9]+"); /*o primeiro [] vai verificar se é um numero positivo ou negativo de 0 a 9 no segundo []
		Que eventualmente pode conter numeros fracionados em ".?" de 0 a 9 no terceiro []*/
		
	
	}
	
}
	

