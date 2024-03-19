
  package simplejava;
  
  public class SwapTwoNumberDifferentWays {
	  
	  //comment //
	  //remove comment ctrl + /
	  // multiline comment ctlr + shift + /
	  //remove multiline comment ctrl + shift + \
  
  public static void main(String[] args) { 
	  int a = 5, b = 6;
  
  
  // Logic 1 use 3rd variable
  
  //int t = a; a= b; b=t;
  
  //System.out.println("After swapping a is : " + a + " After swapping b is : " +  b);
  
  
  // Logic2 - Use + and - : works for zero numbers too
  
  //a= a+b; b= a-b; a= a-b;
  
  //System.out.println("After swapping a is : " + a + " After swapping b is : " + b);
  
  // Logic 3 : Use * and / : works for non zero numbers
  
  //a= a*b; b= a/b; a= a/b;
  
  //System.out.println("After swapping a is : " + a + " After swapping b is : " + b);
  
  // Logic 4 : Use bitwise XOR (^) - converts numbers to decimal
  
  // a= a^b; // b= a^b; // a= a^b;
  
  // System.out.println("After swapping a is : " + a + " After swapping b is : " + b); 
  //assignment is done from right to left, 
  //b= (a+b)-(a=b) // b = 
  
  // Logic 5 : single statement 
  
  //b=(a+b)-(a=b);30-20; 10;
  
 // System.out.println("After swapping a is : " + a + " After swapping b is : " +b); }
  
  }
  }
 