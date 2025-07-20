package Method.Array;

import java.util.*;

public class print {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of Array:");
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter the elements of Array:");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
  }

}
