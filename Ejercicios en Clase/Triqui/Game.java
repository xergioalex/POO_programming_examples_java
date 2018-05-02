
public class Game 
{
	private Board b = new Board();
	private AI ai = new AI(b);

	private void getPlayerMove() 
	{
		ST<Integer, Integer> moves = new ST<Integer, Integer>();

		for (int move : b)
			moves.put(b.getMoveName(move),	move);

		System.out.print("Introduzca movimiento " + moves + ": ");

		int move = StdIn.readInt();

		if (!moves.contains(move)) {
			System.out.println("Mal movimiento, trate de nuevo");
			getPlayerMove();
		}
		else
			b.makeMove(moves.get(move), 'O');
	}

	private void getComputerMove()
	{
		b.makeMove(ai.minimax(), 'X');
	}

	public void run()
	{
		char done = ' ';

		System.out.println("Este es el juego Tic Tac Toe.");
		System.out.println("Usted jugara contra el computador.");
		
		do {
			System.out.println(b);
			getPlayerMove();
			done = b.winner();
			if (b.gameOver() || done != ' ') break;
			getComputerMove();
			done = b.winner();
		} while (done == ' ');
		System.out.println(b);

		if (done == 'O')
			System.out.println("Usted gano!");
		else if (done == 'X')
			System.out.println("Le gane!!!!");
		else
			System.out.println("Empate");
	}

	public static void main(String[] args) 
	{
		Game g = new Game();
		g.run();
	}
}
