class A {
     A (){
          System.out.println("Constructor");    
     }
     void A (){
          System.out.println("Method ");    
     }
     public static void main(String[] args){
               A a =new A(); // Constructor calling 
       //    A(); CE: non-static method A() cannot be referenced from a static context
              a.A(); // method calling 
     }
}
 