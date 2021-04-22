/* final keyword can be used with variables ,methods and class 

fianl with variables make it constant you can't change the value of variables 

final with methods make them unoveridable 

final with class makes them uninheritable 

*/

class A
{
	final int i;
	public void show()
	{
		int i=10; // will give error as i is final
	    System.out.println(i);
    }
}
public FinalDemo
{
	public static void main(String args[])
	{
		A obj = new A();
		obj.show();
	}
}