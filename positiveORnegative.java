import java.util.Scanner;
class integer 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		int n=sc.nextInt();
		if(n==0)
		{
			System.out.println("the number is zero");
		}
		else
		{
			if(n==-1||n==-2||n==-3||n==-4||n==-5||n==-6||n==-7||n==-8||n==-9)
			{
			System.out.println("the number is negative");
			}
			else 
			{
				System.out.println("the number is positive");
			}
		}
	}
}