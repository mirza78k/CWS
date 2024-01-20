public class Bike {
    
      private String brand ;
      private String colour ;
      private String ownerNa ;
      private String bikeNu ;

      public void setBrand(String brand){
           this.brand = brand ;
      }
      public String getBrand(){
           return brand ;
     }

      public void setColour(String colour){
           this.colour = colour;
      }
      public String getColour(){
           return colour ;
     }

      public void setOwnerNa(String  ownerNa){
           this.ownerNa = ownerNa;
      }
      public String getOwnerNa(){
           return ownerNa ;
     }

      public void setBikeNu(String bikeNu ){
           this.bikeNu = bikeNu ;
      }
      public String getBikeNu(){
           return bikeNu;
     }

      public String toString(){
             return "Bike Brand \t :" + brand +"\n"+
                        "Bike Colour    \t :" + colour +"\n"+
	       "Bike Ower Name   :" + ownerNa +"\n"+
	       "Bike Numer \t :" + bikeNu;  
      }
}
class Factory{
    public Bike[] order (int numberOfBikes)throws IllegalArgumentException  {
         if(numberOfBikes<=0)
         throw new IllegalArgumentException("do not pass -ve and zero value");
            


           Bike [] bikes = new Bike[numberOfBikes];
            for(int i =0 ; i<numberOfBikes ; i++){
                 
                Bike bike = new Bike();
                           
                bike.setBrand("Bajaj Pulsar");
             
                bike.setOwnerNa("BK");     

                bike.setBikeNu("TS10 AY943");            
 
                if(i%2==0){ 
                    bike.setColour("Red");
                }else{
                    bike.setColour("Black");
                }
               bikes[i]=bike;
               
       }
     return bikes  ; 
}       
}                                                
public class ShowRoom{
     public static void main(String [] args){
          Factory fac=new Factory();
         try{
            Bike[] bk = fac.order(5);
           for(int i =0 ; i<bk.length; i++){
                System.out.println("bike number "+(i+1));
                 
	System.out.println(bk[i]+""+(i+1));
                 System.out.println("***************************");
           }
         }catch(Exception e){
             System.out.println(e.getMessage());
         } 
     }
}