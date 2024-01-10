

public class Division {
	public static void main(String[] args) {
		 System.out.println("Main Start");
		//System.out.println(10/0);Exception in thread "main" java.lang.ArithmeticException: / by zero
	//	at test/test.Division.main(Division.java:6)
	//	System.out.println(10/2);
         try {
        	 System.out.println(10/0);
		} catch (ArithmeticException e) {
			
			System.out.println("Error :"+ e );
			System.out.println("Do not pass 0 as second value .");
			System.out.println("======================");
			e.printStackTrace();
			System.out.println("==========================");
			System.out.println(e.toString());
			System.out.println("==========================");
			System.out.println(e.getMessage());
			System.out.println();
			
		}
         
		System.out.println("Main End");
		
	}

}
