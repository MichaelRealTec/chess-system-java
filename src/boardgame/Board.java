package boardgame;

public class Board {
	// Atributos
	private int rows;        // rows  =  linhas 
	private int columns;     // columns = colunas
	private Piece[][]pieces; // pieces = peças
	
	// Métodos Getters e Setters
	
	public void setRows(int rows) {
		this.rows = rows;
	}
	
	public int getRows() {
		return rows;
	}
	
	public void setColumns(int columns) {
		this.columns = columns;
	}
	
	public int getColumns() {
		return columns;
	}
	
	// Método Construtor
	public Board(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];
	}
	
	public Piece piece(int row, int column) {
		return pieces[row][column];
	}
	
	// Sobrecarga	
	public Piece piece(Position position) {
		return pieces[position.getRow()][position.getColumn()];
	}
	
	// Métodos
	public void placePiece(Piece piece, Position position) {
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
	}
	
}
