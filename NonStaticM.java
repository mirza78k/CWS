class NonStaticM {
      int x = m1() ;

      int m1(){
           System.out.println(" NSV1 is Executed ");
           return 10 ;
      }

      {
           System.out.println("NSB1 is Executed ");
      }

       NonStaticM(){
            System.out.println("NPC is Executed");
       }

       NonStaticM(String s){
            System.out.println("SPC is Executed");
       }

      {
           System.out.println("NSB2 is Exceuted ");
      }

      int y = m2() ;

      int m2(){
           System.out.println(" NSV2 is Executed ");
           return 20 ;
      }
           
        public static void main(String[] args){
                       
                 System.out.println("MM is Execution Start ");
        
                 NonStaticM t1 =new NonStaticM();            

                 NonStaticM t2 =new NonStaticM("MB");

                 System.out.println("MM is Execution end ");                 
       }      
 
      int z = m3() ;

      int m3(){
           System.out.println(" NSV3 is Executed ");
           return 30 ;
      }

      {
           System.out.println("NSB2 is Executed ");
      }
     
      int m4(){
           System.out.println(" NSV4 is Executed ");
            return 40 ;
       }
}                

























