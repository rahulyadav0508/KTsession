package KT1;

public class PolymorphismDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OverloadingDemo demo1=new OverloadingDemo();
		
		demo1.setSalary(10000);
		
		System.out.println(demo1.salaryAddition()); 
		
		System.out.println(demo1.salaryAddition(1000));
		
		System.out.println(demo1.salaryAddition(1000, 500));
		
		OverloadingDemo1 demo2=new OverloadingDemo1();
		
		demo2.add(10, 20);
		
		demo2.add(30, 22.5);
		
		demo2.add(22.5, 21.7);
		
	}

}
