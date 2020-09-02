public class Main2 {

    public static void main(String[] args) {
        int m = 5, n = 7;
        for (int i = 1; i <= m; i++) {
            for (int j = 0; j < n; j++) {
                if (j % 2 == 0) {
                    System.out.print(i + j * m + " ");
                } else {
                    System.out.print(j * m + m + 1 - i + " ");
                }
            }
            System.out.println();
        }
    }
}
