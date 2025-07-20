import java.util.*;

public class findingelementinarray {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int rows = sc.nextInt();
    int colos = sc.nextInt();

    int x = sc.nextInt();
    int[][] numbers = new int[rows][colos];

    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < colos; j++) {
        numbers[i][j] = sc.nextInt();

      }
    }
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < colos; j++) {
        if (numbers[i][j] == x) {
          System.out.println("X is found at:(" + i + "," + j + ")");

        }
      }
    }

  }
}
