// Final method 
class A 
{
	int i ;
	final public void show()
	{
		Systewm.out.println("In A method");
	}
}
class B extends A 
{

	public void Show() // trying to override super class final method 
	{
		System.out.println("In B show ");
	}
}
public FinalDemo3
{
	public static  void main(String args[])
	{
		B obj = new B();
		obj.show();  // will give error as method is final
	}
}