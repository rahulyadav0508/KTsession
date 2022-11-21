package KT1;

public class OverloadingDemo1 {
	
	void add(int a, int b)
	{		
        System.out.println("sum ="+(a+b));
    } 
 
    void  add(double a, double b)	//overloading add
    {
        System.out.println("sum ="+(a+b));
    } 
    
    void add(int a,double b)
    {
    	System.out.println("sum ="+(a+b));
    }
    
}
