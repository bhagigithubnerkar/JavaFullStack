package inheritance;

public class Employee {
    int id = 1;
    String name = "Pooja";
    float Salary = 50000;
}

class Programmer extends Employee{
    float bonus = 5000;

    public static void main(String[] args){
        Programmer programmer = new Programmer();
        float totalSalary = programmer.Salary + programmer.bonus;
        System.out.println("Total Salary of "+programmer.name+" is " +totalSalary);
    }
}
