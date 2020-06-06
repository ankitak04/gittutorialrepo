
public class Employee {
	
	private int empid;
	
	public Employee(int empid)
	{
		this.empid= empid;
	}

	public void display()
	{
		System.out.println("EMp id :" +empid);
	}

	public static void main(String[] args)
	{
		Employee e = new Employee(234);
		e.display();
	}
}
