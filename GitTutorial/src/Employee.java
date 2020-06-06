
public class Employee {
	
	private int empid;
	private String empname;
	private int empsalary;
	private String empBankName;
	
	public Employee(int empid, String empname , int empsalary , String empBankName)
	{
		this.empid= empid;
		this.empname = empname;
		this.empsalary = empsalary;
		this.empBankName = empBankName;
	}
	
	

	public void display()
	{
		System.out.println("EMp id & Emp Name :" +empid + " >> " +empname +">>>"+ empsalary +" "+empBankName);
	}

	public static void main(String[] args)
	{
		Employee e = new Employee(234,"Ankki" , 20000,"HDFC");
		e.display();
	}
}
