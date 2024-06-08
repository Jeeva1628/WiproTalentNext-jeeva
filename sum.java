import java.util.Scanner;
class sum 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the digit");
		int num=sc.nextInt();
		int sum=0;
		while(num>0)
		{
			sum+=num%10;
			num=num/10;
		}
		System.out.print("SUm of the digits is :"+sum);

	}
}
