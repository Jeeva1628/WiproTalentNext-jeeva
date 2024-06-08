import java.util.Scanner;
class color
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the alphabet:");
		char b=sc.next().charAt(0);
		char a=Character.toUpperCase(b);
		switch(a)
		{
			case 'R':
			{
				System.out.println(a+"->RED");
				break;
			}
			case 'B':
			{
				System.out.println(a+"->Blue");
				break;
			}

			case 'G':
			{
				System.out.println(a+"->Green");
				break;
			}
			case 'Y':
			{
				System.out.println(a+"->Yellow");
				break;
			}
			case 'O':
			{
				System.out.println(a+"->Orange");
				break;
			}
			case 'W':
			{
				System.out.println(a+"->White");
				break;
			}
			default:
			{
				System.out.println("Invalid input");
				break;
			}
		}

	}
}
