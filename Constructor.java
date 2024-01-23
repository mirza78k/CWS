class Constructor {
             Constructor(){ // here we are creating constuctor and allways constructor  name   should be  the class   

                     System.out.println("Constructor");

                // return ;here no CE RE but it Consider as method
              }  

              void  Constructor(){} // it vaild but it is not constructor , it is a method 

         //  static  Constructor(){}  CE : modifier static not allowed here and all 8 type Excution level modifiers

               private Constructor(){} Vaild  it is constructor

                Constructor()throws IllegalArgumentException{}  Vaild  it is constructor

                Constructor()throws IllegalArgumentException{  
                         throw new  IllegalArgumentException();  //Vaild  it is constructor
                 }   
          
                Constructor(){
                           return ;  Vaild  it is constructor      
                }  
                               
                     Constructor(){
                                 return 5 ;  //not allowed , it's CE :  incompatible types: unexpected return value     
                    }

          public static void main (String[] args){
              
            new Constructor(); // by using new keyword  call constructor 

            Constructor c1 =new Constructor(); // by this also we call the constructor 
 
       // Constructor () ; here CE : can not find symbol , because We can't call directly like method
                
            
                       
     }
}