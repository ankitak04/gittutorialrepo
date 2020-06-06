
public class StringJava {
	
	public static void main(String[] args)
	{
	
	String empname =" Git is a version tracking system";
	
	String[] name = empname.split("\\s",3);
	
	for(String s: name)
	{
		System.out.println(s);
	}
	
	
	for(String s: name)
	{
		int length = s.length();
		
		System.out.println("Length of word:" + length);
	}
	
	for(String s: name)
	{
		System.out.print(s);
	}
	
}
}

