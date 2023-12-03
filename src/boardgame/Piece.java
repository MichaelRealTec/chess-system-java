package boardgame;

public abstract class Piece {
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
	
	// Métodos
	public abstract boolean[][] possibleMoves();
	
	public boolean possibleMove(Position position) {
		return possibleMoves()[position.getRow()][position.getColumn()];
	}
	
	public boolean isThereAnyPossibleMove() {
		boolean[][] mat = possibleMoves();
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				if (mat[i][j]) {
					return true;
				}
			}
		}
		return false;
	}
	
}
