package boardgame;

public class Position {
	// Atributos
	private int row;      // row = linha
	private int column;   // column = coluna
	
	// Métodos Getters e Settesr
	
	public void setRow(int row) {
		this.row = row;
	}
	
	public int getRow() {
		return row;
	}
	
	public void setColumn(int column) {
		this.column = column;
	}
	
	public int getColumn() {
		return column;
	}
	
	public void setValues(int row, int column) {
		this.row = row;
		this.column = column;
	}
	
	
	// Método Construtor
	public Position(int row, int column) {
		this.row = row;
		this.column = column;
	}
	
	// Métodos
	@Override
	public String toString() {
		return row + ", " + column;
	}
}
