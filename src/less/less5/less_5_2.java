package less.less5;

import java.util.Random;

/**
 * Created by лтд on 15.11.2016.
 */
public class less_5_2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int C[][] = new int[15][15];
        int sum = 0;

        for (int i = 0; i < C.length; i++)
        {
            for (int j = 0; j < C[i].length; j++)
            {
                C[i][j] = rand.nextInt(10);
                System.out.println(C[i][j]);
                if(i == j)
                {
                    System.out.println(C[i][j]);
                    sum = sum + C[i][j];
                }
            }
        }
        System.out.println("Сумма диагональных элементов: "+sum);
    }
}
