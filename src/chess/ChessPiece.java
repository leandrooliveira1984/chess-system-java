package chess;

import boardgame.Board;
import boardgame.Piece;

public class ChessPiece extends Piece {// � uma sub classe da Piece

	private Color color;

	public ChessPiece(Board board, Color color) { // o construtor foi criado com o Board pois o atributo "Position"
		super(board);                   // da classe Piece est� protected. O Board ser� repassado da super classe
		this.color = color;
	}

	public Color getColor() {
		return color;
	}
	
}

