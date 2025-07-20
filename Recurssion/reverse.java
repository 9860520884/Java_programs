package Recurssion;

import java.util.*;

public class reverse {
  static void rev(int i, int n) {
    if (i < 1)
      return;
    System.out.print(i + "  ");
    rev(i - 1, n);

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    rev(n, n);

  }

}
