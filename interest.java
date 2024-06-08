class interest
	{
public static void main(String[] args){
	String s=args[0];
	int age=Integer.parseInt(args[1]);
	if((s.equals("Female")) && age>=1 && age<=58)
	{
	System.out.println("The percentage of interest is 8.2");
	}
	else if((s.equals("Female")) && age>=59 && age<=100)
	{
	System.out.println("The percentage of interest is 9.2");
	}
	else if((s.equals("male")) && age>=1 && age<=58)
	{
	System.out.println("The percentage of interest is 8.4");
	}
	else if((s.equals("male")) && age>=59 && age<=100)
	{
	System.out.println("The percentage of interest is 10.5");
	}
   }
  }
