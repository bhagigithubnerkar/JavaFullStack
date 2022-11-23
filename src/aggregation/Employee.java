package aggregation;

public class Employee {
    int empNo;
    String name;
    Address address;
}

class Address{
    String flatNo;
    String street;
    String buildingName;
    String landmark;
    Double pincode;
    String city;
}
class EmpImpl{
    public static void main(String[] args) {
       Employee employee = new Employee();
       employee.empNo = 111;
       employee.name = "Sumant";


       Address workAddress = new Address();
       workAddress.buildingName = "Bandal Complex";
       workAddress.street = "Paud Road";
       workAddress.city = "Pune";
       workAddress.flatNo = "9/A";
       workAddress.landmark = "Near Kothrud Depot";
       workAddress.pincode = 411038d;
       employee.address = workAddress;

        System.out.println("Emp No "+employee.empNo);
        System.out.println("Emp Name "+employee.name);
        System.out.println("Building Name "+workAddress.buildingName);
        System.out.println("Strret "+workAddress.street);
        System.out.println("City "+workAddress.city);
        System.out.println("FlatNo "+workAddress.flatNo);
        System.out.println("Landmark "+workAddress.landmark);
        System.out.println("Pincode "+workAddress.pincode);


    }
}

