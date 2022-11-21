package KT1;

public class EmployeeStaticDemo {
	
	private int id;
	private String name;
	private static String organization; //static variable
	
	
	//getters and setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOrganization() {
		return organization;
	}
	public void setOrganization(String organization) {
		EmployeeStaticDemo.organization = organization;
	}
	
	@Override
	public String toString() {
		return "EmployeeStaticDemo [id=" + id + ", name=" + name + "]";
	}
	
	
	
}
