package collections;


import java.util.Iterator;
import java.util.LinkedList;

class Emp {
    Integer empId;
    String name;
    Long mobile;

    public Emp(int empId, String name, Long mobile) {
        this.empId = empId;
        this.name = name;
        this.mobile = mobile;

    }
}

class EmpImpl {
    public static void main(String[] args) {
        LinkedList<Emp> list = new LinkedList<>();
        Emp e1 = new Emp(560, "Chetan", 9045673245L);
        Emp e2 = new Emp(890, "Minal", 8956780234L);
        Emp e3 = new Emp(540, "Monali", 7654321904L);
        list.add(e1);
        list.add(e2);
        list.add(e3);
        for (Emp e : list) {
            System.out.println(e.empId + " " + e.name + " " + e.mobile);
        }
    }
}






