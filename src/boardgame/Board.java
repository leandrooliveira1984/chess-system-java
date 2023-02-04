package boardgame;

public class Board {

	private int rows; // o tabuleiro possui uma quantidade de linhas dentre dele 
	private int columns; // o tabuleiro possui uma quantidade de colunas
	private Piece [][] pieces; // o tabuleiro possui uma matriz de peças do tipo Pecas (Pieces)
	
	public Board(int rows, int columns) {
		if (rows < 1 || columns < 1) {
			throw new BoardException ("Error creating Board: there must be at least 1 row and 1 column.");
		}
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns]; // a Matriz de peças será instanciada com peças com a quantidade linhas
		                                // e colunas informadas, na construção do tabulerio.
	}

	public int getRows() {
		return rows;
	}

	public int getColumns() {
		return columns;
	}

	public Piece piece (int row, int column) {
		if (!positionExists(row, column)) {
			throw new BoardException ("Position not on the Board!");
		}
		return pieces [row][column];// recebe uma linha e uma coluna para
		                            //retorna a peça na matriz Pieces na linha row e coluna column.
	}
	
	public Piece piece (Position position) { // sobreposição do método para retornar uma posição no tabuleiro
		if (!positionExists(position)) {
			throw new BoardException ("Position not on the Board!");
		}
		return pieces[position.getRow()][position.getColumn()];
	}
	
	public void placePiece(Piece piece, Position position) {
		if(thereIsAPiece(position)) {
			throw new BoardException("There is already a piece on position: " + position);
		}
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
	}
	
	private boolean positionExists(int row, int column) {
		return row >= 0 && row < rows && column >= 0 && column < columns;
	}
	
	public boolean positionExists(Position position) {
		return positionExists (position.getRow(), position.getColumn());
	}
	
	public boolean thereIsAPiece(Position position) {
		if (!positionExists(position)) {
			throw new BoardException ("Position not on the Board!");
		}
		return piece(position) != null; // método Piece piece;
	}
	
}
