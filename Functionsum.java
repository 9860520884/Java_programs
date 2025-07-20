import java.util.*;

public class Functionsum {
  public static int CalculateSum(int a, int b) {

    return a + b;

  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first number:");
    int a = sc.nextInt();
    System.out.println("Enter Second Number:");
    int b = sc.nextInt();

    System.out.println("Sum is:" + CalculateSum(a, b));
  }

}
