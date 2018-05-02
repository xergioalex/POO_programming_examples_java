import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AI 
{
	private Board board;
	
	public AI(Board board)
	{
		this.board = board;
	}

	private int judge(char winner) 
	{
		return (winner == 'X') ? 1 : (winner == ' ') ? 0 : -1;
	}

	public int minimax()
	{
		List<Move> moves = new ArrayList<Move>();
		for (int move : board) {
			Board c = new Board(board);
			c.makeMove(move, 'X');
			moves.add(new Move(move, redValue(c, 'O')));
		}
		return Collections.max(moves).getMove();
	}

	private int blueValue(Board b, char player) 
	{
		if (b.gameOver()) return judge(b.winner());
		int max = -Integer.MAX_VALUE;
		for (int m : b) {
			Board c = new Board(b);
			c.makeMove(m, player);
			int x = redValue(c, (player == 'X') ? 'O' : 'X');
			if (x > max) max = x;
		}
		return max;
	}
	
	private int redValue(Board b, char player) 
	{
		if (b.gameOver()) return judge(b.winner());
		int min = Integer.MAX_VALUE;
		for (int m : b) {
			Board c = new Board(b);
			c.makeMove(m, player);
			int x = blueValue(c, (player == 'X') ? 'O' : 'X');
			if (x < min) min = x;
		}
		return min;
	}
}
