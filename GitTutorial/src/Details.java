
public class Details {
	
	public static void main(String[] args)
	{
	
	String empname =" Git is a version tracking system";
	
	String[] name = empname.split("\\s",3);
	
	for(String s: name)
	{
		System.out.println(s);
	}
	
}
}

