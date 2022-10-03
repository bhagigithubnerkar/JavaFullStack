package oops;

public class House {
    String Name;
    String Loc;
    int HouseNo;

    void showData() {
        System.out.println("Name" + Name);
        System.out.println("Location" + Loc);
        System.out.println("House no" + HouseNo);
    }

}

class HouseImpl {
    public static void main(String[] args) {
        House h1 = new House();
        h1.Name = "Samruddhi";
        h1.Loc = "Kothrud";
        h1.HouseNo =5;
        h1.showData();

    }
}



