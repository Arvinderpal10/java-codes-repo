class EmptyBorder
{
	int Salary;
	int id;
	static String ceo;
	
	Static 			// Static block 
	{
		ceo="Sundar Pichai";
		System.out.println("In Static ");
	}
	public Emp()		// constructor 
	{
		id=2;
		salary=4000;
		System.out.ptintln("in constructor");
		
	}
}

public StaticDemo2
{
	public static void main(String args[])
	{
		Employee Apal= new Employee();
		
	}
}

/* staic block gets executed when we load the class means ones per class .
A static block always  gets executed before constructors  whatever the sequence is .
if more than one static blocks are there in the class then these will be executed according to the sequence.


Constructor gets executed when we create oblects of the class .



*/