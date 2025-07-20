package Method.Array.key;

class MobileTest {

  String brand;
  int price;
  String name;

  public void mobil() {
    System.out.println("Brand: " + " " + brand + " " + "Price: " + " " + price + " " + "Name: " + name);
  }

}

public class Mobile {
  public static void main(String[] args) {

    MobileTest mb = new MobileTest();
    mb.brand = "Samsung";
    mb.price = 30000;
    mb.name = "Smart Phone";

    MobileTest obj2 = new MobileTest();
    obj2.brand = "Redme9";
    obj2.price = 50000;
    obj2.name = "Smart Phone";
    mb.mobil();
    obj2.mobil();

  }
}
