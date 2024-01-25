package Blocks;

public class Static_block {
     static int a ;// 10
	static {
    	System.out.println("SB");
    	
    	a = 10 ;
    	int a = 60 ; //a=60
    	a=50;
    	Static_block.a =70 ;
    	System.out.println(a);
    	
     
    	String si = new String("Happy");
    	System.out.println(si);
    }
	static { 
		System.out.println("SB2");
	}
	
    public static void main(String[] args) {
		System.out.println("\n main");
	   /* System.out.println(a); we not access  static block variable out side of the static block 
	   System.out.println(si);
		System.out.println("a :"+a);
    	
  	  static {
		System.out.println("SB3");//CE : 
      }  */
    	
		
  	}
}
class Ex{
	public Ex() {
             super();
	}
	public static void main(String[] args) {
		System.out.println("main");
	}
	static {
		/*
		 * static { System.out.println("sb"); 
		 * }
		 * we can't create static block inside a static block  
		 */

		{
			System.out.println("SB1");
		}	
		
		{
			System.out.println("SB2");
		}
		
		{
			System.out.println("SB3");
		}
		
	}
	
}
class Example {
	static int  a ;
	static int  b ;
	static {
		a = 10 ;//static field a intialization logic
	}
	static {
		b = 10 ;//static field a intialization logicWS
	}
	public static void main(String[] args) {
		System.out.println("A : "+a);
		System.out.println("B : "+b);
	}
}
