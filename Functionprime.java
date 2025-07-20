import java.util.*;

public class Functionprime {
  public static void prime(int n) {
    int i = 1;
    i++;
    if (n % i != 0 || n % 9 != 1) {
      System.out.println(+n + " is  Prime Number");
    } else {
      System.out.println(+n + "is not Prime Number");
    }

  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter any number:");
    int n = sc.nextInt();
    prime(n);
  }

}
