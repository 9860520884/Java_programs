package Method.Array;

public class arraysum {

  public void ss() {
    int[] arr = { 1, 3, 5 };

    int sum = 0;
    for (int i = 0; i < 3; i++) {
      sum += arr[i];

    }
    System.out.println(sum);
  }

  public static void main(String[] args) {
    arraysum sc = new arraysum();
    sc.ss();

  }

}
