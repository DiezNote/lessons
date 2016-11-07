package less;

import java.util.Scanner;

public class lesson_2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double cost = 0;
        System.out.print("Введите сумму покупки:");
        cost = sc.nextDouble();
        double skidka_3 = cost *0.03;
        double skidka_5 = cost *0.05;
        //double skidka_10 = cost *0.1;
        if (cost > 1000){
            System.out.println("Ваша скидка 5% ! Сумма покупки со скидкой:"+(cost-skidka_5)+".руб");
        }else if(cost > 500) {
            System.out.println("Ваша скидка 3% ! Сумма покупки со скидкой:"+(cost-skidka_3)+".руб");
        }else {
            System.out.println("Нет скидки =(");
        }
    }
}