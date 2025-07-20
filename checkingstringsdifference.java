import java.util.*;

public class checkingstringsdifference {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the first String:");
    String name1 = sc.nextLine();
    System.out.print("Enter the second String:");
    String name2 = sc.nextLine();

    if (name1.compareTo(name2) == 0) {
      System.out.println("Stringd are same");

    } else {
      System.out.println("Strings are not same");
    }

  }

}
