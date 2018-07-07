package StringHandLing;


import java.lang.*;

public class Calculate {


		

   public static void main(String[] args) {
			
			String a , b;
		
			
			 int result;
		     int c, d;
		     //a = "-12";
		     a = "25";
		     b = "5";
		     //b = "0";
		     //b = "40";
		     System.out.println( " a lenght is :" +a.length());
		     System.out.println(" b lenght is :" + b.length());
		     
		     c  = Integer.parseInt(a);
			 d = Integer.parseInt(b);
			 
			 System.out.println("a is " +c );
			 System.out.println("b is " +d );
			 
			/* The length of the input strings will be between 1 and 40,000 characters inclusive
			 The strings will represent non-negative integers
			 For a - b, assume a is larger than b
			 For a / b, assume b is never 0 and the return value is integer division
			 */
	
	
		if  ( a.length() <= 1 ||  a.length() >= 40000 || b.length() <= 1 || b.length() >= 40000 )
			 {
			  System.out.println( "a or b lenght  beteewn 1 and 40000");
			 // break;
			 
			 if((a.indexOf("-")!=-1) || (b.indexOf("-")!=-1))
		       {  
			    System.out.println("there is '-' in a or b string");
		       }
			 else 
			   
			    {
				 if (d > c )
			       {
		    	  System.out.println( "value of b greater than a ");	
		           //break;
			       }
		    	  if( d == 0)
				    { 
				  System.out.println( "value b can not be 0");
				   //break;
				   }
			      
		         
		    	  System.out.print("\n Addition = " +(c + d) );
		    	  System.out.print("\n Subtraction = " + (c-d));
		    	  System.out.print("\n Multiplying = " +(c *d));
		    	  System.out.print("\n Division = " +(c/d));
		    
		  
			    }
		
			 }
		
   	}
}
 
 	

