package inheritance;

public class Vehicle {
   String ModelNo = "XUV500";
   String Name = "MarutiSuzuki";
   int Price = 300000;

}

class Car extends Vehicle{
    int Value = 500000;

    public static void main(String[] args){
        Car car = new Car();
        int totalPrice = car.Price + car.Value;
        System.out.println("Total Price of " +car.Name+" is " +totalPrice);
    }
}
