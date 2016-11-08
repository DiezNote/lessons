package homework.hw2;

import java.util.Scanner;

/**
 * проверка введенного целого числа на четность
 */
public class hw_2_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chislo = 0;
        System.out.println("Введите целое число и нажмите <Enter>");
        chislo = sc.nextInt();
        if((chislo % 2) == 0)
            System.out.print("Число "+chislo+" четное");
        else
            System.out.print("Число "+chislo+" нечетное");
    }
}
