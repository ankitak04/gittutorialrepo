
public class Employee {
	
	private int empid;
	private String empname;
	private int empsalary;
	
	public Employee(int empid, String empname , int empsalary)
	{
		this.empid= empid;
		this.empname = empname;
		this.empsalary = empsalary;
	}
	
	

	public void display()
	{
		System.out.println("EMp id & Emp Name :" +empid + " >> " +empname +">>>"+ empsalary);
	}

	public static void main(String[] args)
	{
		Employee e = new Employee(234,"Ankki" , 20000);
		e.display();
	}
}
