package exceptions;

public class UtenteBannatoException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public UtenteBannatoException(String utente) {
		
		super(utente+" � bannato e non pu� acquistare qui.");
	}

}
