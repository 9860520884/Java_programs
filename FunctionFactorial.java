import java.util.*;

public class FunctionFactorial {
  public static void PrintFactorial(int n) {
    if (n < 0) {
      System.out.println("Invali");
      return;
    }
    int Factorial = 1;
    for (int i = n; i >= 1; i--) {
      Factorial = Factorial * i;

    }
    System.out.println(Factorial);
    return;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Print number for factorial:");
    int n = sc.nextInt();
    System.out.print("Factorial is:");
    PrintFactorial(n);
    return;
  }

}
