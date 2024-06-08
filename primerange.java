import java.util.*;

class prime 
	{
    public static void main(String[] args) 
		{
        int num1,num2, i,j;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the range:");
        num1 = sc.nextInt();
		num2 = sc.nextInt();
			for(j=num1;j<=num2;j++)
			{
				int count=0;
				for (i = 2; i <=j; i++)
				{
					if (j % i == 0) 
					{
						count++;
					}
				}
				if (count <= 1) 
				{
				 System.out.println(j);
				}
				
			}
    }
}
