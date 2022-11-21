package KT1;

public class Basics {
	
	public static void main(String args[])
	{
		int num[]=new int[10];
		
		for(int i=0;i<10;i++) //for loop demo
		{
			num[i]=i+1;
		}
		for(int i:num) //foreach loop
		{
			System.out.println(i);
			if(i==5)	//if-else
			{
				System.out.println("Five");
			}
			else
			{
				System.out.println("Not Five");
			}
		}
		
		int flag=3;
		
		switch(flag) //switch demo
		{
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("Three");
			break;
		default:
			System.out.println("Rest");
			break;
		}
		
	}
}
