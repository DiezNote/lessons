package homework.hw3;

import java.util.Scanner;

/**
 * Created by лтд on 11.11.2016.
 */
public class hw_3_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите x <без пробелов>: ");
        long x = sc.nextLong();
        String y = Long.toString(x);
        int len_x = y.length();
        float[] t = new float[len_x];
        float z = 0;
        //float[] z = new float[len_x];                   //ф-я

        for (int i = len_x - 1; i >= 0; i--) {
            t[i] = x % 10;                              //массив иксов
            x /= 10;
        }
        int i = 0;
        int l = factorial(len_x);
        for(int j = 0;j < len_x; j++)
        {
            i=1;
            l = factorial(i);
            z = z +((i+t[j])/l);
            System.out.println("Значение ф-ии z["+(j+1)+"] = "+z+" при х = "+t[j]);
            i++;
        }
    }
//

    public static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++)
            fact = fact * i;
        return fact;
    }
}
