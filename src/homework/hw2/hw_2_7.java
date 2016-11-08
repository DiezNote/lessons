package homework.hw2;

import java.util.Scanner;

/**
 * трехзначное число
 */
public class hw_2_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chislo[] = new int[3];
        chislo[0] = 1;
        chislo[1] = 2;
        chislo[2] = 3;

        int a = 123;

        int a1 = 123/100; // 1.23 = 1

        System.out.println("Число 123");
        if (chislo[0]>chislo[2])
            System.out.println("первая цифра больше");
        else
            System.out.println("поседняя цифра больше");
        if (chislo[0]>chislo[1])
            System.out.println("первая цифра больше");
        else
            System.out.println("вторая цифра больше");
        if (chislo[1]>chislo[2])
            System.out.println("вторая цифра больше");
        else
            System.out.println("поседняя цифра больше");
        }
    }
