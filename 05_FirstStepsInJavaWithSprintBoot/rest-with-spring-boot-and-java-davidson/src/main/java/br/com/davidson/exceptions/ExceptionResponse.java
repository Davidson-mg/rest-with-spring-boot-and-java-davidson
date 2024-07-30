package br.com.davidson.exceptions;

import java.io.Serializable;

import java.util.Date;


/*No caso da interface Serializable, ela indica que objetos da classe ExceptionResponse podem ser serializados, ou seja, 
 * convertidos em uma sequência de bytes que pode ser gravada em um arquivo ou transmitida pela rede e posteriormente 
 * reconstruída em um objeto idêntico.*/
public class ExceptionResponse implements Serializable{/*Em casos de aplicações grandes, você pode fazer cache da instância da classe em disco, 
	trafegar em instância pela rede, entre outros. Por isso que a gente usa Serializable. Todo framework no Java, por exemplo, o Hibernate precisa do Serializable.*/

	private static final long serialVersionUID = 1L; /*Em resumo, serialVersionUID ajuda a garantir que a serialização e a desserialização de objetos de uma classe 
	sejam feitas de maneira segura e compatível entre diferentes versões da classe.*/
	
	
	/*A declaração private static final long serialVersionUID = 1L; em uma classe Java que implementa a interface Serializable serve para definir um identificador 
	 * de versão da classe. Esse identificador é usado durante o processo de serialização e desserialização para garantir que um objeto serializado e a classe que 
	 * o desserializa sejam compatíveis em termos de versão.*/
	
	private Date timestamp;
	private String message;
	private String details;
	
	public ExceptionResponse(Date timestamp, String message, String details) {

		this.timestamp = timestamp;
		this.message = message;
		this.details = details;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}
	
	
	
}
