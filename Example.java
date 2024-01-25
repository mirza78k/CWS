package Blocks;

/*public class NonStatic {
	
	 * {
	 *  // non static block is also called instance block \
	 * } void m1() {
	 *  { //
	 * instance block is only at class
	 *  } 
	 *  }
	 
	
}
*/
/*
 * class Local_Block{
 * 
 * public static void main(String[] args) { { // in main method we create local
 * block } } }
 */
class Example {

	public static void main(String[] args) {
		System.out.println("NSB");
		System.out.println("main");
		new Example(5);
	}
	

	Example e1;

	Example() {

		e1 = new Example();
	}

	Example(int a){
     		System.out.println("IPC");
     	}//

	Example(String s){
     		System.out.println("SPC");
     	}
	
	{
		System.out.println("hi");
		 //new Example("MB");
     
	}
}

