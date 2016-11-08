package homework.hw2;

import java.util.Scanner;

/**
 * проверка делимости введенного числа с клавиатуры на 3
 */
public class hw_2_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chislo = 0;
        System.out.print("Введите число: ");
        chislo = sc.nextInt();
        if ((chislo % 3) == 0)
            System.out.print("Число "+chislo+" делиться нацело на 3");
        else
            System.out.print("Число "+chislo+" не делиться нацело на 3");
    }
}
