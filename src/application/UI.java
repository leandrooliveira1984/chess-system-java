package application;

import chess.ChessPiece;

public class UI {

	public static void printBoard(ChessPiece[][] pieces) {
		for (int i=0; i<pieces.length; i++) {
			System.out.print((8-i + " "));
			for (int j=0; j<pieces.length;j++) {
				printPiece(pieces[i][j]);
			}
			System.out.println();
		}
		System.out.println("  a b c d e f g h");
	}
	
	private static void printPiece(ChessPiece piece) {
		if (piece == null) { 
			System.out.print("-");
		}
		else {
			System.out.print(piece);
		}
		System.out.print(" ");
	} /*M�todo auxiliar para imprimir uma pe�a. 
	* se a pe�a for igual a nulo quer dizer que n�o tinha pe�a no tabuleiro >> imprime o "-";
	* caso contrario imprime a pe�a. No final imprimir um espa�o em branco para 
	* que as pe�as n�o fiquem grudadas umas nas outras */
	
}
