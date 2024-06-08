import java.util.Scanner;
class  palindrome
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int rev=0;
		int n=0;
		int temp=num;
		while (num > 0) {
             n = num % 10; 
            rev = rev * 10 + n; 
            num /= 10; 
		}
		if(temp==rev)
		{
		System.out.println("the number is palindrome ");
		}
		else
		{
		System.out.println("the number is not palindrome ");

        }
	}
}
