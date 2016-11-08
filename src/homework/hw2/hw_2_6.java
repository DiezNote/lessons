package homework.hw2;

import java.util.Scanner;

/**
 * стоимость разговора по телефону
 */
public class hw_2_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = 0;
        int time = 0;
        double price = 0;
        double money_per_min = 0;
        double sale_20 = 0.2;

        System.out.println("Вычисления стоимости разговора по телефонy.");
        System.out.println("Введите исходные данные: ");
        System.out.print("Цена за минуту разовора -> ");
        money_per_min = sc.nextDouble();
        System.out.print("Длитеьность разовора(целое количество минут) -> ");
        time = sc.nextInt();
        System.out.print("День недели(1-понедельник, ... 7-воскресенье) -> ");
        day = sc.nextInt();

        price = time * money_per_min;
        switch (day){
            case 1:
                System.out.println("Скидки нет.");
                break;
            case 2:
                System.out.println("Скидки нет.");
                break;
            case 3:
                System.out.println("Скидки нет.");
                break;
            case 4:
                System.out.println("Скидки нет.");
                break;
            case 5:
                System.out.println("Скидки нет.");
                break;
            case 6:
                System.out.println("Предоставляеться скидка 20%");
                price = price-(price*sale_20);
                break;
            case 7:
                System.out.println("Предоставляеться скидка 20%");
                price = price-(price*sale_20);
                break;
        }
        System.out.println("Стоимость разговора: "+price+" грн.");
    }
}
