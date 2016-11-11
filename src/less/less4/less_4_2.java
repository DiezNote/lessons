package less.less4;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by лтд on 11.11.2016.
 */
public class less_4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размер массива:");
        int n = sc.nextInt();
        Random rand = new Random();
        int mass[]= new int[n];
        for(int i = 0;i < n;i++){
            mass[i] = rand.nextInt(1000);
            System.out.println("mass[ "+i+" ]= "+mass[i]);
        }
        for(int i = 0; Math.pow(2,i) < mass.length; i++)
        {
            System.out.println("i= "+(int)(Math.pow(i,2))+" значение = "+mass[(int)Math.pow(i,2)]);
        }

    }
}