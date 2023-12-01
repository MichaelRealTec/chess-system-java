package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class King extends ChessPiece {
	// Atributos
	
	
	// Método Construtor
	public King(Board board, Color color) {
		super(board, color);
	}
	
	
	// Método
	@Override
	public String toString() {
		return "K";
	}
}
