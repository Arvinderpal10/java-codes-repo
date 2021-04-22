class Outer
{
	//int salary;
	public void display()
	{
		System.out.println("In method of outer class ");
	}
	
	class Inner
	{
		public void Show()
		{
		System.out.println("in Inner class ");
		}
	}	
}


public InnerDemo
{
	public static void main(String args [])
	{
		Outer out= new Outer();
		out.display();
		Outer.Inner inr = out.new Inner();
	}
}
/* To use the inner class itself  we have to use the outer class and  

in order to create the object of inner class we use the object of outer class 
*/