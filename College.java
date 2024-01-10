package com.nareshit.project;

public class College {

    void m1(){
          Student obj = new Student();
          obj.Name="HK";
          obj.class_section="10 C";
          obj.RollNumber=101;
          obj.PhoneNo=987654321;
          System.out.println("Name          : "+obj.Name);
          System.out.println("Class_Section : "+obj.class_section);
          System.out.println("RollNumber    : "+obj.RollNumber);
          System.out.println("PhoneNo       : "+obj.PhoneNo);
              
          
    }
    
    
    


	String m2(){
    	 Student obj = new Student();
         obj.Name="BK";
         obj.class_section="10 D";
         obj.RollNumber=102;
         obj.PhoneNo=984554875;
			
             
    	 return "Name          : " + obj.Name + "\nClass_Section : " + obj.class_section + "\nRollNumber    : " + obj.RollNumber
				+ "\nPhoneNo       : " + obj.PhoneNo + "";
    	
    	
     
   }
}

