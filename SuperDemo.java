class A
{
	public A()
	{
		System.out.println("I am in class A  default constructor ");
	}
	public A(int j)
	{
		System.out.println(j);
	}
}
class B 
{   
	public B()
	{
		super(5);  // will call parametric of A 
		System.out.println("I am in default B ");
	}
	public B(int i)
	{   super(i);  // will call parametric of A
		System.out,println(i);
	}
}
public SuperDemo 
{
	public static void main(String args[])
	{
		A sup = new A(); // will call the default constructor of A 
		B base = new B(); /*Will call the default constructor A and default of B */
		B base1= new B(5)  // default of A and parametric of B
}