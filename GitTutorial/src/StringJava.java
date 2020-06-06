
public class StringJava {
	
	public static void main(String[] args)
	{
	
	String empname =" Git is a version tracking system";
	
	String[] name = empname.split("\\s",3);
	
	for(String s: name)
	{
		System.out.println(s);
	}
	
	System.out.println("AAAAAAAAAAAAAAA");
	
	for(String s: name)
	{
		int length = s.length();
		
		System.out.println("Length of word:" + length);
	}
	
}
}

