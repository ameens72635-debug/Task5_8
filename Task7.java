class Employee{
   double baseSalary=45000;
   double calculateSalary(){
    return baseSalary;
   }
}
class SalesEmployee extends Employee{
     double bonus=4999;
     double calculateSalary(){
        return baseSalary+bonus;
     }
}
public class Task7 {
    public static void main(String[] args) {
        Employee e=new Employee();
        SalesEmployee se=new SalesEmployee();
        System.out.println("BASESALARY:"+e.calculateSalary());
        System.out.println("BASE SALARY and BONOUS:"+se.calculateSalary());
    }
}
