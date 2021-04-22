class calc
{
	int num1;
	int num2;
	int result ;
	
	public calc()
	{
		num1=67;  // Default constructor 
		num2=45;
		System.out.println("In consturctor");
	}
	
} 

public class ConstructorDemo
{
	public static void main(String args[])
	{
		Calc obj= new Calc();
		System.out.println(obj.num1);
	}
	
	
}