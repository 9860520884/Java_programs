import java.util.*;

public class sumarray {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Size of Array:");
    int n = sc.nextInt();

    int arr[] = new int[n];
    System.out.println("Enter Array Elements:");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    // int arr[] = { 23, 1, 34, 21, 22, 67 };
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
    }
    System.out.println(" Sum of Array is:" + sum);

  }

}
