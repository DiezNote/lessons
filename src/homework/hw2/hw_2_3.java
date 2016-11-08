package homework.hw2;

import java.util.Scanner;

/**
 * написать программу для вычисления стоимости покупки с учетом скидки
 */
public class hw_2_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double price = 0;
        double price_after_sale = 0;
        System.out.print("Введите стоимость покупки :");
        price = sc.nextDouble();
        double sale_3 = 0.03 * price;
        double sale_5 = 0.05 * price;

        if(price > 1000) {
            price_after_sale = price - sale_5;
            System.out.println("Стоимость покупки со скидкой в 5% равна "+price_after_sale+" руб.");
        }else if(price > 500){
            price_after_sale = price - sale_3;
            System.out.println("Стоимость покупки со скидкой в 3% равна "+price_after_sale+" руб.");
        }
    }
}

