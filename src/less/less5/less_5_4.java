package less.less5;

import java.util.Random;

/**
 * Created by лтд on 15.11.2016.
 */
public class less_5_4 {
    public static void main(String[] args) {
        Random rand = new Random();
        double[][] B = new double[5][5];

        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[i].length; j++) {
                B[i][j] = rand.nextDouble() + rand.nextInt(100);
                System.out.printf("%.4f\t", B[i][j]);
            }
            System.out.println();
        }
        double sum[] = new double[5];

        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[i].length; j++) {
                sum[i] =  sum[i]+ B[i][j];
                sum[i] = Math.abs(sum[i]);
            }
            System.out.printf("%.1f\t",sum[i]);
        }
        System.out.println();
        double max = 0;
        for (int i = 0; i < sum.length; i++){
            if(sum[i]>max){
                max = sum[i];
            }
            System.out.println("Максимальная сумма по строкам - "+max+" в строке "+(++i));}
    }
}

