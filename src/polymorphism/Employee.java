package polymorphism;

public class Employee {
    void calculatesalary(){
        System.out.println("Salary is 78000");
    }
    static void getbonus(){
        System.out.println("Bonus is 500");
    }
}

class Programmer extends Employee{
    @Override
    void calculatesalary() {
        System.out.println("Salary is 100000");
    }
    //get bonus method cannot be override because this method is static
}

class EmployeeImpl{
    public static void main(String[] args) {
        Programmer programmer = new Programmer();
        programmer.calculatesalary();
    }

}