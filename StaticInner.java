public Outer 
{
	public static  void show()
	{
		System.out.println("In outer class method ");
	}
    
    class static Inner{
		public void display()
		{
			System.out.println("In inner ");
		}
	}	
}
public StaticInner()
{
	public static void main()
	{
		Outer out = new Outer();
		out.show();
		Outer.Inner inr = new Outer.Inner ();
		inr.display();
	}
}