package less.less5;

import java.util.Random;

/**
 * Created by лтд on 15.11.2016.
 */
public class less_5_1 {
    public static void main(String[] args) {
        Random rand = new Random();
        double[][] B = new double[5][5];

        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[i].length; j++) {
                B[i][j] = rand.nextDouble()+rand.nextInt(100);
                System.out.printf("%.4f\t",B[i][j]);
            }
            System.out.println();
        }

        double max = B[0][0];
        double min = B[0][0];

        for(int i = 0; i < B.length; i++)
        {
            for (int j = 0; j< B[i].length; j++)
            {
                if(B[i][j]>max)
                    max = B[i][j];
                else if(B[i][j]<min)
                    min = B[i][j];
            }
        }
        System.out.println("Максимальное : "+max+" Минимальное : "+min);
    }
}
