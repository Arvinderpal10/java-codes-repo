 class Calc
 {
	 int num1;   
	 int num2;
	 int result ;
	   
	 public calc()
	 {
		 System.out.println("In Default Constructor ");
	 }	
     
      public Calc(int a)
	  {
		  num1=a;
		  System.out.println("In parametric constructor"):
	  }	
     
      public Calc(double d,int k)
      {
		  num1=(int)d;
		  num2=k;
		  System.out.println("In another parametric constructor ");
	  }	  

 }
 public ConstructorDemo2{
	 
 public static void main(String args[])
 {
	 Calc obj1= new Calc();
	 Calc Obj2=new Calc(5);
	 Calc obj3= new Calc(4.3,7);
	 System.out.println(" BACK IN MAIN ");
	 
 }
 }