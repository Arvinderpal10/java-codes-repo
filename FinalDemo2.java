// final class 
final class A
{
	System.out.println("IN shpw ");
} 

class B extends A /* will give error as Final class can't be inherited */
{
	int i;
	public void display(int i)
	{
	System.out.println("IN B");
	}
}
public FinalDemo2
{
	public static void main(String args[])
	{
		B obj = new B();
		obj.show(); // Error 
		
	}
	
} 