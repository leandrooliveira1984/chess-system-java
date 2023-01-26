package boardgame;

public class Position {

	private int row;
	private int column;
	
	public Position(int row, int column) {
		this.row = row;
		this.column = column;
	}
	
	public int GetRow() {
		return row;
	}
	public void SetRow(int row) {
		this.row = row;
	}
	
	public int GetColumn() {
		return column;
	}
	public void SetColumn(int column) {
		this.column = column;
	}
	
	@Override
	public String toString() {
		return row + ", " + column;
	}
}
