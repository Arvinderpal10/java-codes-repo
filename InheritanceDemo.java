
class Calc
{
	public void add(int i,int j)
	{
		return i +j;
	}
}
class AdvCalc extends Calc
{
  public void sub(int i,int j)
  {
	 return i-j; 
  }
}
class VeryAdvCalc extends AdvCalc
{
	public void multi()
	{
		return i*j;
	}
}
class UltraAdvCalc extends VeryAdvCalc
{
	
	public void division(){
	return i/j;
}
}
public InheritanceDemo{
public static void main(String args[])
{
	UltraAdvCalc op=new Calc();
	System.out.println(op.add(9,7));
	System.out.println(op.sub(9,7));
	System.out.println(op.multi(6,3));
	System.out.println(op.division(12,4)); 
	
}
}