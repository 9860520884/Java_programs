public class studentmarks {

  public static void main(String[] args) {

    int[] marks = { 23, 45, 34, 67, 78, 56, 90, 26, 100 };

    for (int i = 0; i < marks.length; i++) {

      if (marks[i] < 35) {

        System.out.println(i);
      }

    }

  }

}
