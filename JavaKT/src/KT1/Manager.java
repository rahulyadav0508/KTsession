package KT1;

public class Manager extends Employee{
	
	private int numberOfSubordinates;
	
	

	public Manager(int id,String name,String role) {
		super(id,name,role);
		// TODO Auto-generated constructor stub
	}

	public int getNumberOfSubordinates() {
		return numberOfSubordinates;
	}

	public void setNumberOfSubordinates(int numberOfSubordinates) {
		this.numberOfSubordinates = numberOfSubordinates;
	}
	
	
}
