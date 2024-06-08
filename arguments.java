class argument
	{
public static void main(String[] args){
	if(args.length==0)
	{
	System.out.println("No values");
	}
	else 
	{
		for(String args1:args){
			System.out.print(args1+",");
		}
	}
}
	}