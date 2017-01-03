package raja;

import org.testng.annotations.Test;

public class Testpackage {
  @Test
	public static void login() {
		  
		try{  
		    int a[]=new int[5];  
		    a[5]=30/0;  
		   }  
		   
		   catch(ArithmeticException e){System.out.println("task1 is completed");}  
		   catch(ArrayIndexOutOfBoundsException e){System.out.println("task 2 completed");}
		catch(Exception e){System.out.println(e);}  
		   System.out.println("rest of the code..."); }
	}

