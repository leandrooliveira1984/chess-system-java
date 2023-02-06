package chess;

import boardgame.Board;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch { // é nesta classe que terão as regas de xadrez.

	private Board board; // uma partida de xadre possui um tabuleiro.
	
	public ChessMatch() {
		board = new Board (8, 8); // quem tem que saber a dimensão do tabuleiro é a classe ChessMatch. Assim todo
		inicialSetup();           // tabuleiro do partida terá a dimensão (8, 8). 
	}
	
	public ChessPiece[][] getPieces(){ // retorna a Matriz de peças
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		for (int i=0; i<board.getRows(); i++) {
			for(int j=0; j<board.getColumns(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i, j);// matriz [i][j] receba a peça do tabuleiro
			}                                              // com o DownCasting para que a peça seja da Partida e não
		}                                                  // do tabuleiro.
		return mat;
	
	} /*este método retorna uma matriz de peças de xadrez, correspondente ao ChessMatch (partida de xadrez). 
	Um tabuleiro tem uma matriz de peças, e serão liberadas ao Programa principal as peças do tipo ChessPiece e não
	ao tipo Piece. Assim o programa so poderá enxergar o ChessPieces.
	  /* Criado uma variável temporária do tipo ChessPiece como o nome de mat iniciada com new ChessPiece 
	   * com a quantidade de linhas e colunas do tabuleiro.É criado um laço for para percorrer a matriz de peças 
	   * do Tabuleiro(Board) e para cada peça do tabuleiro é feito um DownCasting para ChessPiece */

	/*Casting - é uma conversão de um objeto, permitido devido a herença. O Upcasting é quando atribuimos um 
	 * objeto instanciado a uma classe em um nivel hierarquico maior e o Downcasting é o inverso.*/
	
	private void placeNewPiece(char column, int row, ChessPiece piece) {
		board.placePiece(piece, new ChessPosition(column, row).toPosition());
	}
	
	private void inicialSetup() {
		placeNewPiece('b', 6, new Rook(board, Color.WHITE));
		placeNewPiece('e', 8, new King(board, Color.BLACK));
		placeNewPiece('e', 1, new King(board, Color.WHITE));
	}
	
	
	
	
	
	
	
	
}  

	