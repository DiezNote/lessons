package homework.hw3;

import java.util.Scanner;

/**
 * Created by лтд on 11.11.2016.
 */
public class hw_3_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите исходное: ");
        long x = sc.nextLong();
        String y = Long.toString(x);
        int len_x = y.length();
        float[] t = new float[len_x];
        for(int i = len_x - 1; i >= 0; i--){
            t[i] = x % 10;
            x /= 10;
        }
        int count_a = 0;
        int count_b = 0;
        System.out.print("Введите цифру а: ");
        int a = sc.nextInt();
        System.out.print("Введите цифру b: ");
        int b = sc.nextInt();
        for(int i = 0; i < len_x ; i++)
        {
            if(a == t[i])
                count_a++;
            if(b ==t[i])
                count_b++;
        }
        if(count_a == 0 && count_b == 0)
            System.out.println("Искомые цифры в числе не встречаются");
        if(count_a > count_b)
            System.out.println("Цифра а втречается чаще b");
        else if(count_a < count_b)
            System.out.println("Цифра b втречается чаще a");
        else if(count_a == count_b)
            System.out.println("Цифра a втречается настолько же часто как b");
    }
}
