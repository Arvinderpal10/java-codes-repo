class Employee
{
	private int id ;
	private String name;
	public void getId()
	{
		return id;
		
	}
	
	public void setId(int id)
	{
		this.id=id;
	}
	public void getName()
	{
		return name;
		
	}
	public void setName(String name)
	{
		this.name=name;
	}
}

public EncapsulationDemo
{
	public static void main(String[] args)
	{
		Employee emp= new Employee();
		emp.setId(3);
		emp.setName("Arvinder");
		System.out.println(getId());
		System.out.println(getName());
	}
}