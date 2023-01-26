package boardgame;

public class Board {

	private int rows;
	private int columns;
	private Piece [][] pieces; // matriz de peças do tipo Pecas (Pieces)
	
	public Board(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns]; // a Matriz de peças será instanciada com peças com a quantidade linhas
		                                // e colunas informadas, na construção do tabulerio.
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}	
}
