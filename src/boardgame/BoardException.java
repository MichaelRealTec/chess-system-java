package boardgame;

public class BoardException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public BoardException(String msg) {
		super(msg);
		// Este construtor apenas passa a mensagem de exceção para a Classe Exception
	}
	
	
}
