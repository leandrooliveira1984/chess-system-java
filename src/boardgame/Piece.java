package boardgame;

public class Piece { // A classe tem um atributo "position" e ele é protected - #
                     // pois esse tipo de posição é uma matriz... ela não deve ser visível na camada do xadrez.
	protected Position position;
	private Board board;  // também possui uma associação da peça (piece) com o tabuleiro (board)
	
	
	public Piece(Board board) {
		this.board = board; // utilizado somente o board pois a posição inicial da peça é nula. A peça começa o 
		position = null;    // zadrez em uma posição fora do tabuleiro.
	}

	protected Board getBoard() { // o tabuleiro não poderá ser acessível a outra camadas. Somente tabuleiro- board ou subclasse
		return board;
	}
	// não foi criado o método SetBoard pois ele não poderá ser alterado.
}
