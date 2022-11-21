package KT1;

public class OverloadingDemo {

	private int salary;
	
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int salaryAddition()
	{
		return salary;
	}
	
	public int salaryAddition(int bonus) //overloading salaryAddition method.
	{
		return salary+bonus;
	}
	
	public int salaryAddition(int bonus,int tax) //overloading salaryAddition method.
	{
		return salary+bonus-tax;
	}
}
