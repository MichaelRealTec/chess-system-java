package boardgame;

public class Piece {
	// Atributos
	protected Position position;    // posição
	private Board board;            // tabuleiro
	
	// Métodos Getters e Setters
	
	protected Board getBoard() {
		return board;
	}
	
	// Método Construtor
	public Piece(Board board) {
		this.board = board;
		position = null;
	}
}
