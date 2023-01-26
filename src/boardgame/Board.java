package boardgame;

public class Board {

	private int rows;
	private int columns;
	private Piece [][] pieces; // matriz de pe�as do tipo Pecas (Pieces)
	
	public Board(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns]; // a Matriz de pe�as ser� instanciada com pe�as com a quantidade linhas
		                                // e colunas informadas, na constru��o do tabulerio.
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
