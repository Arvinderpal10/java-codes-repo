 class Casio
 {   int num;
	 public Casio()
	 {
		 System.out.println("Default Constructor ");
	 }
	 public Casio(int num1)
	 {   
	     
		 System.out.println(num1);
	 }
	  
	 public Casio(int num1,int num2)
	 {
		 System.out.println(num1+num2);
	 }	 
	 
	 public Casio(double num1,double num2)
	 {
		 System.out.println(num1+num2);
	 }
 }
 
 
 public MethodOverloading
 {
	 public static void main(String args[])
	 {
		Casio Obj = new Casio();
		Casio obj1= new Casio(5);
		Casio obj2= new Casio(5,7);
		Casio obj3= new Casio(4.6 ,7.9);
		
	 }
 }