package homework.hw2;

import java.util.Scanner;

/**
 * проверка знаний даты основания Одессы
 */
public class hw_2_2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int year = 1794;
        int answer = 0;
        System.out.println("В каком году была основана Одесса?");
        answer = sc.nextInt();
        if(answer != year ) {
            System.out.println("Вы ошиблись. Одесса была создана в 1794 году.");
        }else {
            System.out.println("Вы правы!");
        }
    }
}
