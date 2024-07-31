package br.com.davidson.converters;

public class NumberConverter {

	public static Double convertToDouble(String strNumber) {
		
		/*Vamos aceitar um numero double com "." ou com ",". Por isso vamos tratar*/
		if (strNumber == null)return 0D;
		
		String number = strNumber.replaceAll (",","."); //Trocando "," por ".", pois a java entende double como "." e não ","
		

		if (isNumeric(number)) return Double.parseDouble(number); /*se number no retorno da função "isNumeric" e já convertido (pois a variavel number inicialmente é string)
		é numerico, converte a string para double*/
		
		return 0D;
	}

	public static  boolean isNumeric (String strNumber) {
		
		/*Vamos aceitar um numero double com "." ou com ",". Por isso vamos tratar*/
		if (strNumber == null) return false;
		
		String number = strNumber.replaceAll (",","."); //Trocando "," por ".", pois a java entende double como "." e não ","
	
		return number.matches("[-+]?[0-9]*\\.?[0-9]+"); /*o primeiro [] vai verificar se é um numero positivo ou negativo de 0 a 9 no segundo []
		Que eventualmente pode conter numeros fracionados em ".?" de 0 a 9 no terceiro []*/
		
	
	}
	
}
