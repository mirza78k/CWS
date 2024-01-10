 class Example1{
	 private static void m1(){
		System.out.println(" m1  ");
	 }
	 static void m2(){
		System.out.println(" m2");
	 }
	 static void m3(){
		System.out.println("  m3 ");
	 }
}

public class Test {
	public static void main(String[ ] args){
	//	m1(); error: cannot find symbol
    //	Example1.m1(); error: m1() has private access in Example1
	      Example1.m2();

	}
}