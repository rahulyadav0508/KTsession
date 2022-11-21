package KT1;

public class PolymorphismDemo1 {
	
	public static void main(String args[])
	{
		OverridingDemo demo1=new OverridingDemo();
		demo1.display();
		
		OverridingDemo demo2=new OverridingDemo1();
		demo2.display();
	}
}
