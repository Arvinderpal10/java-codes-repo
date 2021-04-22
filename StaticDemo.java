
Class Employee
{
	int salary;       // non-static instance variable 
	int id;
	static String ceo;  // static  instance variable 
}// we don't need objects  to call a static method 
public StaticDemo
{
	public static void main(String args [])
	{
		Employee Apal= new Employee();
		Apal.salary=7000;
		Apal.id= 1;
		Employee.ceo= "Sunder Pichai" ;
		
		Employee Hpal = new Employee();
        Hpal.salary= 8000;
		Hpal.id= 2;
		Employee.ceo="Sunder Pichai"; 
		/* no need to write  Apal.ceo or Hpal.ceo 
		 Static belongs to a class not to a particular object
		 */ 
	}
}