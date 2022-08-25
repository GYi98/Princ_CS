public class BandMatrix {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int width = Integer.parseInt(args[1]);
        String[][] arrStr = new String[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arrStr[i][j] = "0";
                for (int k = 0; k <= width && i + k < n; k++) {
                    arrStr[i][i + k] = "*";
                    arrStr[i + k][i] = "*";
                }
                for (int k = 0; k <= width && j + k < n; k++) {
                    arrStr[j + k][j] = "*";
                }
                System.out.print(arrStr[i][j] + " ");
            }
            System.out.println("");
        }

    } // main
} // class




