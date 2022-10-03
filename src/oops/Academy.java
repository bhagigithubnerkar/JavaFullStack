package oops;

public class Academy {
    String Name;
    long  MobileNo;
    String Subject_taught;

    void showData(){
        System.out.println("Name            :"+Name);
        System.out.println("MobileNo        :"+MobileNo);
        System.out.println("Subject_taught  :"+Subject_taught);
    }
}
class AcademyImpl {
    public static void main(String[] args) {
       Academy a1 = new Academy();
       a1.Name = "Prithvi";
       a1.MobileNo =  919423320931L;
       a1.Subject_taught = "English";
       a1.showData();





    }
}
