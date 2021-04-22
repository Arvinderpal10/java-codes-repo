import java.util.Random;
public class RandomPasswordGenerator{
 	public static void main(Strings args[])
		{
			int length=10; // generated password length
			System.out.println(generatedPswd(length));

               }
           
				static char[]=generatePswd(int len){
					System.out.println("Your Password is :");
					String charcaps="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
					String chars="abcdefghijklmnopqrstuvwxyz";
					String nums="0123456789";
					String symbols= "!@#$%^&*_+=-<>";
					String passSymbols=charcaps + chars+nums + symbols;
					Random rnd=new Random();
					char [] password= new char[len];
					int index=0;
					for(int i=0; i<len;i++){
						password[i]=passSymbols.charAt(rnd.nextInt(passSymbols.length());
					}
					
					return password;
				}
	
  }