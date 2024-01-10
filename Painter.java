class Painter {   
     public static void main(String[] agrs){
           Shape s1;
         
         s1=new Circle() ;
 //        s1.findArea();

         s1=new Rectangle() ;
//         s1.findArea();

         s1=new Triangle() ;
//         s1.findArea();

         s1=new Square() ;
//         s1.findArea();

         Circle c1 = new Circle();
          c1.r=10;
          c1.findArea();

          Rectangle r1 = new Rectangle();
          r1.l=10;
          r1.b=20;
          r1.findArea();
            
          Square sq1 = new Square();
          sq1.s=200;
          sq1.findArea();
 
          Triangle t1 = new Triangle();
          t1.l=12;
          t1.b=13;
          t1.findArea();


     }
}