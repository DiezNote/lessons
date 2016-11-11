package less.less4;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by лтд on 11.11.2016.
 */
public class less_4_3 {
    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int n = sc.nextInt();
        int sum = 0;
        int mass[] = new int[n];
        for(int i = 0;i < n;i++){
            mass[i] = rd.nextInt(100);
            System.out.println("mass[ "+i+" ]= "+mass[i]);
        }
        for (int i = 0; i < n ; i++){
            if(mass[i]%2 == 0)
            {
                sum = mass[i]+sum;
                System.out.println("Суммируемые элементы : mass[ "+i+" ]= "+mass[i]);
            }
        }
        System.out.println("Сумма = "+sum);
    }
}
