package less.less5;

import java.util.Random;

/**
 * Created by лтд on 15.11.2016.
 */
public class less_5_3 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[][] B = new int[5][5];

        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[i].length; j++) {
                B[i][j] = rand.nextInt(100);
                System.out.print(B[i][j] + "\t");
            }
            System.out.println();
        }

        int max = B[0][0];
        int min = B[0][0];

        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[i].length; j++) {
                if (B[i][j] > max)
                    max = B[i][j];
                else if (B[i][j] < min)
                    min = B[i][j];
            }
        }
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[i].length; j++) {
                if (B[i][j] == max)
                    System.out.println("Максимальное - [" + i + ";" + j + "] = " + max);
                else if (B[i][j] == min)
                    System.out.println("Минимальное - [" + i + ";" + j + "] = " + min);
            }
        }
    }
}
