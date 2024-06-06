import java.util.Scanner;
class alphabet 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the character:");
		char a=sc.next().charAt(0);

		if(Character.isLetter(a))
		{
		System.out.println("Alphabet!");
		}
		else if(Character.isDigit(a))
		{
			System.out.println("Number!");
		}
		else
		{
			System.out.println("Symbol!");
		}
	}
}
