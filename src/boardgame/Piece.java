package boardgame;

public class Piece { // A classe tem um atributo "position" e ele � protected - #
                     // pois esse tipo de posi��o � uma matriz... ela n�o deve ser vis�vel na camada do xadrez.
	protected Position position;
	private Board board;  // tamb�m possui uma associa��o da pe�a (piece) com o tabuleiro (board)
	
	
	public Piece(Board board) {
		this.board = board; // utilizado somente o board pois a posi��o inicial da pe�a � nula. A pe�a come�a o 
		position = null;    // zadrez em uma posi��o fora do tabuleiro.
	}

	protected Board getBoard() { // o tabuleiro n�o poder� ser acess�vel a outra camadas. Somente tabuleiro- board ou subclasse
		return board;
	}
	// n�o foi criado o m�todo SetBoard pois ele n�o poder� ser alterado.
}
