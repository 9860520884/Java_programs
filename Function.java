import java.util.*;

public class Function {

  public static void PrintMyName(String name) {
    System.out.println(name);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Print my Name:");

    String name = sc.next();
    System.out.print("My name is:");

    PrintMyName(name);
  }
}