package KT1;

public class StaticDemo1 {
	
	public static void main(String args[])
	{
		EmployeeStaticDemo emp1=new EmployeeStaticDemo();
		
		emp1.setId(1001);
		emp1.setName("Rahul");
		emp1.setOrganization("Accenture");
		
		System.out.println(emp1); //displays first employee's details.
		System.out.println("Organizatioin: "+emp1.getOrganization());
		
		EmployeeStaticDemo emp2=new EmployeeStaticDemo();
		
		emp2.setId(1002);
		emp2.setName("Ajay");
		emp2.setOrganization("BOFA"); //this also over writes first employee's organization value
		
		System.out.println(emp2); //displays second employee's details.
		System.out.println("Organizatioin: "+emp2.getOrganization());
		
		System.out.println(emp1); //to display change in first employee detials.
		System.out.println("Organizatioin: "+emp1.getOrganization());
		//System.out.println("hi");
		
		
		
	}
}
