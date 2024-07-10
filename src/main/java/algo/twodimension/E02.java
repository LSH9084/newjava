package algo.twodimension;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class E02 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int [][] number1 = new int[9][9];
        
        for (int i = 0; i < 9; i++) {
            String[] str1 = br.readLine().split(" ");
            for (int j = 0; j < 9; j++) {
                number1[i][j] = Integer.parseInt(str1[j]);
            }
        }

        int maxVal = number1[0][0];
        int maxRow = 0;
        int maxCol = 0;
        
        
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (number1[i][j] > maxVal) {
                    maxVal = number1[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }
        
        System.out.println(maxVal);
        System.out.println((maxRow + 1) + " " + (maxCol + 1));
    }
}
