public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!!!");
        int count = 1, m = 7, n = 5;
        boolean flag = true;
        int square[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (flag) {
                    square[i][j] = count;
                } else {
                    square[i][n - 1 - j] = count;
                }
                count++;
            }
            flag = !flag;
        }
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++) {
                System.out.print(square[i][j] + " ");
            }
            System.out.println();
        }
    }
}
