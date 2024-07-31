package br.com.davidson.math;

public class SimpleMath {
	public Double sum (	Double numberOne, Double numberTwo) {
		
		return numberOne + numberTwo; /*Retorna o valor depois de converter para numero chamando os metodos aabaixo*/
	}
	
	public Double subtraction (	Double numberOne,Double numberTwo){
		return numberOne - numberTwo; /*Retorna o valor depois de converter para numero chamando os metodos aabaixo*/
	}
	
	public Double multiplication (Double numberOne, Double numberTwo) {
		return numberOne * numberTwo; /*Retorna o valor depois de converter para numero chamando os metodos aabaixo*/
	}
	
	
	public Double division (Double numberOne,Double numberTwo) {
		return numberOne / numberTwo; /*Retorna o valor depois de converter para numero chamando os metodos aabaixo*/
	}
	
	public Double squareRoot (Double number) {
		return Math.sqrt(number); /*Retorna o valor depois de converter para numero chamando os metodos aabaixo*/
	}

	
	public Double media (Double numberOne,Double numberTwo){
		return (numberOne + numberTwo) / 2; /*Retorna o valor depois de converter para numero chamando os metodos aabaixo*/
	}
	
	
	
	
	/*O Spring consegue mapear uma requisição especifica para um método especifico através de um “@RequestMapping”.*/
	/*@RequestMapping(value = "/media/{numeberOne}/{numberTwo}", method=RequestMethod.GET)
	public Double media (		
			/*Essa pathVariable é utilizada para recuparar dados da URL. Permite que o nosso controller lide com URLs parametrizadas*/
			/*@PathVariable(value = "numeberOne") Double numberOne,
			@PathVariable(value = "numberTwo") Double numberTwo
		) throws Exception {
		
		
		return (numberOne) + NumberConverter.converToDouble (numberTwo)) / 2; /*Retorna o valor depois de converter para numero chamando os metodos aabaixo*/
	/*}*/
	
}
