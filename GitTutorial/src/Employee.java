
public class Employee {
	
	private int empid;
	private String empname;
	
	public Employee(int empid, String empname)
	{
		this.empid= empid;
		this.empname = empname;
	}
	
	

	public void display()
	{
		System.out.println("EMp id & Emp Name :" +empid + " >> " +empname);
	}

	public static void main(String[] args)
	{
		Employee e = new Employee(234,"Ankki");
		e.display();
	}
}
