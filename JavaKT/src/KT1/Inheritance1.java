package KT1;

public class Inheritance1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1=new Employee();
		emp1.setId(1001);
		emp1.setName("Rahul");
		emp1.setRole("Jr developer");
		
		Manager m1=new Manager(1000, "Manish", "Manager");
		m1.setNumberOfSubordinates(10);
		
		System.out.println(m1.getId()+" "+m1.getName()+" "+m1.getRole()+" "+m1.getNumberOfSubordinates());
		
	}

}
