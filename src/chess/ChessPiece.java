package chess;
import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;


public abstract class ChessPiece extends Piece {
	// Atributos
	private Color color;
	private int moveCount;
	
	// Método Getter e Setter
	public Color getColor() {
		return color;
	}
	

	public ChessPosition getChessPosition() {
		return ChessPosition.fromPosition(position); 
	}
	
	public int getMoveCount() {
		return moveCount;
	}
	
	// Método construtor
	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}
	
	// Método
	protected boolean isThereOpponentPiece(Position position) {
		ChessPiece p = (ChessPiece)getBoard().piece(position);
		return p != null && p.getColor() != color;
	}
	
	public void increaseMoveCount() {
		moveCount++;
	}
	
	public void decreaseMoveCount() {
		moveCount--;
	}
	

}
