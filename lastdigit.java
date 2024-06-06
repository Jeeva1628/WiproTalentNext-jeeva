import java.util.Scanner;
class lastdigit
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the numbers");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int n,m;
		n=num1%10;
		m=num2%10;
		if(n==m)
		{
			System.out.println(true);
		}
		else
		{
			System.out.println(false);
		}
	}
}
