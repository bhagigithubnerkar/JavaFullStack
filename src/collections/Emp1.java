package collections;

import java.util.LinkedList;

class Emp1 {
    Integer empId;
    String name;
    String mobileNo;

    public Emp1(Integer empId, String name, String mobileNo) {
        this.empId = empId;
        this.name = name;
        this.mobileNo = mobileNo;
    }
}


class Emp1Impl {
    public static void main(String[] args) {
        LinkedList<Emp1> list = new LinkedList<>();  // list 1
        Emp1 e1 = new Emp1(123, "Mohan", "9023456678");
        Emp1 e2 = new Emp1(230, "Minal", "9423567890");
        Emp1 e3 = new Emp1(123, "Dhiraj", "9426890123");
        list.add(e1);
        list.add(e2);
        list.add(e3);
        for (Emp1 emp1 : list) {
            System.out.println(emp1.empId + " " + emp1.name + " " + emp1.mobileNo);

        }
    }
}
