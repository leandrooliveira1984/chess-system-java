package boardgame;

public class Board {

	private int rows; // o tabuleiro possui uma quantidade de linhas dentre dele 
	private int columns; // o tabuleiro possui uma quantidade de colunas
	private Piece [][] pieces; // o tabuleiro possui uma matriz de pe�as do tipo Pecas (Pieces)
	
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
	
	public Piece piece (int row, int column) {
		return pieces [row][column];// recebe uma linha e uma coluna para
		                            //retorna a pe�a na matriz Pieces na linha row e coluna column.
	}
	
	public Piece piece (Position position) { // sobreposi��o do m�todo para retornar uma posi��o no tabuleiro
		return pieces[position.getRow()][position.getColumn()];
	}
	
	public void placePiece(Piece piece, Position position) {
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
	}
	
	
	
	
	
	
}
