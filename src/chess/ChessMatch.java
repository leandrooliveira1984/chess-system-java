package chess;

import boardgame.Board;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch { // � nesta classe que ter�o as regas de xadrez.

	private Board board; // uma partida de xadre possui um tabuleiro.
	
	public ChessMatch() {
		board = new Board (8, 8); // quem tem que saber a dimens�o do tabuleiro � a classe ChessMatch. Assim todo
		inicialSetup();           // tabuleiro do partida ter� a dimens�o (8, 8). 
	}
	
	public ChessPiece[][] getPieces(){ // retorna a Matriz de pe�as
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		for (int i=0; i<board.getRows(); i++) {
			for(int j=0; j<board.getColumns(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i, j);// matriz [i][j] receba a pe�a do tabuleiro
			}                                              // com o DownCasting para que a pe�a seja da Partida e n�o
		}                                                  // do tabuleiro.
		return mat;
	
	} /*este m�todo retorna uma matriz de pe�as de xadrez, correspondente ao ChessMatch (partida de xadrez). 
	Um tabuleiro tem uma matriz de pe�as, e ser�o liberadas ao Programa principal as pe�as do tipo ChessPiece e n�o
	ao tipo Piece. Assim o programa so poder� enxergar o ChessPieces.
	  /* Criado uma vari�vel tempor�ria do tipo ChessPiece como o nome de mat iniciada com new ChessPiece 
	   * com a quantidade de linhas e colunas do tabuleiro.� criado um la�o for para percorrer a matriz de pe�as 
	   * do Tabuleiro(Board) e para cada pe�a do tabuleiro � feito um DownCasting para ChessPiece */

	/*Casting - � uma convers�o de um objeto, permitido devido a heren�a. O Upcasting � quando atribuimos um 
	 * objeto instanciado a uma classe em um nivel hierarquico maior e o Downcasting � o inverso.*/
	
	private void placeNewPiece(char column, int row, ChessPiece piece) {
		board.placePiece(piece, new ChessPosition(column, row).toPosition());
	}
	
	private void inicialSetup() {
		placeNewPiece('b', 6, new Rook(board, Color.WHITE));
		placeNewPiece('e', 8, new King(board, Color.BLACK));
		placeNewPiece('e', 1, new King(board, Color.WHITE));
	}
	
	
	
	
	
	
	
	
}  

	