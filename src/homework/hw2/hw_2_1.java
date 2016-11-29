package homework.hw2;

import java.util.Scanner;

/**
 * вычисление частного двух чисел
 */
public class hw_2_1 {
    public static void main(String args[]){
        int a = 0;
        int b = 0;
        Scanner sc = new Scanner(System.in);//

        System.out.println("a:b = c");
        System.out.print("введите а:");
        a = sc.nextInt();
        System.out.print("введите b:");
        b = sc.nextInt();

        if(b == 0){
            System.out.println("Ошибка ввода! b не может быть равен 0");
        } else{
            System.out.println("c = "+ a / b);
        }
    }
}
