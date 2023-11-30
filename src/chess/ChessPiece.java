package chess;
import boardgame.Board;
import boardgame.Piece;


public class ChessPiece extends Piece {
	// Atributos
	private Color color;
	
	// Método Getter e Setter
	public Color getColor() {
		return color;
	}	
	
	// Método construtor
	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}
	
}
