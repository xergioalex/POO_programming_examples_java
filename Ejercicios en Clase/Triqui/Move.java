
public class Move implements Comparable<Move> 
{
	private int move;
	private int val;
	
	public Move(int move, int val) 
	{
		this.move = move;
		this.val  = val;
	}

	public int getMove() 
	{
		return move;
	}

	public int getVal() 
	{
		return val;
	}
	
	public String toString() 
	{
		return "(" + move + ", " + val + ")";
	}

	@Override
	public int compareTo(Move m) 
	{
		return (val > m.getVal()) ? 1 : (val == m.getVal()) ? 0 : -1;
	}
}
