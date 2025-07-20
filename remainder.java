import java.util.Scanner;

public class remainder {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter First Number:");
    double a = sc.nextLong();
    System.out.print("Enter Second Number:");
    double b = sc.nextLong();
    double c = a % b;
    System.out.println("Remainder is:" + c);

  }

}
