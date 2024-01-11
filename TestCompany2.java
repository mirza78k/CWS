class Employee2 {
      String ename ;
      char egender ;
      String eno  ;
      String edep ;
      double eSal ;
} 
class Company2{
     void display(Employee2 e){
          System.out.println("Name           : "+e.ename);
          System.out.println("Gender   : "+e.egender);
          System.out.println("Employee No.  : "+e.eno);
          System.out.println("Department : "+e.edep);
          System.out.println("Salary           : "+e.eSal);    
    }
     void annSal(Employee2 e){
         System.out.println("AnnualSalary :"+e.eSal*12);
     }
     void incSal (Employee2 e ){
         System.out.println("Yearly increment in Salary : "+e.eSal*20/100);
     }
}
public class TestCompany2{
    public static void main(String[] args){
        Employee2 emp1 = new Employee2();
        emp1.ename   ="HK";
        emp1.egender ='M';
        emp1.eno        ="hd1008923k2";
        emp1.edep      ="Java Devloper";
        emp1.eSal       =150000;

        Employee2 emp2 = new Employee2();
        emp2.ename   ="BK";
        emp2.egender ='M';
        emp2.eno        ="hdf1001123c2";
        emp2.edep      ="Front end  Devloper";
        emp2.eSal       =60000;

        Company2 cmp = new Company2();
     
        cmp.display(emp1);
        cmp.annSal(emp1);
        cmp.incSal(emp1);
        System.out.println("----------------------------");
        cmp.display(emp2);
        cmp.annSal(emp2);
        cmp.incSal(emp2);
        
    }
}