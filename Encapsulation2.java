class Student
{
	 private int rollno;
	 private String name;
	 
	 public void setRollno(int rollno)
	 {
		 this.rollno = rollno;
	 }
	 public void Rollno()
	 {
		 return rollno;
	 }
	 public void setName(int name)
	 {
		 this.name = name;
	 }
	 public void getName()
	 {
		 return name;
	 }
}

public Encapsulation2
{
	public static void main(String[] args)
	{
		Student s1 = new Student();
		s1.setName("Harvinder");
		System.out.println(getName());
		s1.setRollno(45);
		System.out.println(getRollno());
		
		
		Student s2= new Student();
		s2.setName("Anita");
		System.out.println(getName());
		s2.setRollno(32);
		System.out.println(getRollno());
		
	}
}