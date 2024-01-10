class Example {
    static void m1(){
        System.out.println("Static m1 ");
    }
      void m2(){
            System.out.println("Non-Static m1");
     }
     public static void main(String[] agrs){
         //static method  
         m1(); //we can access Direct with method name
        Example.m1();// we can access with class name 
        Example e1 = new Example ();// we can also access by making object 
        e1.m1();
        Example e2 = null ; // also access from null referenced
       e2.m1();
         // Non-Static
       //  m2(); CE: non-static method m2() cannot be referenced from a static context
        //    Example.m2();CE: error: non-static method m2() cannot be referenced from a static context
               System.out.println();
         e1.m2();// no CE : , no RE: , because By create object 
      
       e2.m2();// no CE: ,RE : java.lang.NullPointerException
     } 
}