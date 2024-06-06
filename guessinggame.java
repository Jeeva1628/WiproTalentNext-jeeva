import java.util.Scanner;
class Guesser
{
	int gnum;
	int guessNum()
	{
		System.out.println("Guesser! kindly guess a num between 1 to 100:");
		Scanner sc=new Scanner(System.in);
		gnum=sc.nextInt();
		return gnum;
	}
}
class Player
{
	int pnum;
	int guessNum()
	{
		System.out.println("player! kindly guess the num between 1 to 100:");
		Scanner sc=new Scanner(System.in);
		pnum=sc.nextInt();
		return pnum;
	}
}
class Umpire
{
	int guesser;
	int player1;
	int player2;
	int player3;

	void collectNumFromGuesser()
	{
		Guesser g=new Guesser();
		guesser=g.guessNum();
	}
	void collectNumFromPlayers()
	{
		Player p1=new Player();
		Player p2=new Player();
		Player p3=new Player();

		player1=p1.guessNum();
		player2=p2.guessNum();
		player3=p3.guessNum();
	}
      void compare()
	{
		 if(guesser==player1 && guesser==player2 && guesser==player3)
		{
			 System.out.println("game draw!");
		}
		else if(guesser==player1 && guesser==player2)
		{
			System.out.println("winner cannot be decided:");
		}
		else if(guesser==player1 && guesser==player3)
		{
			System.out.println("winner cannot be decided:");
		}
		else if(guesser==player2 && guesser==player3)
		{
			System.out.println("winner cannot be decided:");
		}
      else if(guesser==player1)
		{
		  System.out.println("player1 wins:");
		}
	 else if(guesser==player2)
		{
		System.out.println("player2 wins:");
		}
	 else if(guesser==player3)
		{
		System.out.println("player3 wins:");
		}
     else
		{
		 System.out.println("game lost try again");
		}
	 }
}
class guessinggame
{
	public static void main(String[] args) 
	{
		Umpire u=new Umpire();
		u.collectNumFromGuesser();
		u.collectNumFromPlayers();
		u.compare();
	}
}
