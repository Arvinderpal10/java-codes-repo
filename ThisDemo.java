
class Calc
{
	int num1;  // instance Variables belongs to  a particuar object
	int num2;        // instance scope
	int result;   
	
	
public Calc(int num1, int num2)  // local variables in local scope
	{                                   
		
		this.num1=num1;    /* local variables also shadows the instance variables*/
		this.num2=num2;
		System.out.println("This  represents the current object");
		
	}
	
	
}


public ThisDemo
{
	public static void main(String args[])
	{
		Calc obj= new Calc(4,6);
	}
	
}