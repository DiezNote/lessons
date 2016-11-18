package homework.x_o;

import java.util.Scanner;

/**
 * Created by лтд on 18.11.2016.
 */
public class Tic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int field[][] = new int[3][3];

        for(int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++)
            {
                field[i][j] = 0;
            }
        }
        System.out.println("---------");

        for(int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++)
            {
                System.out.print(field[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("---------");



    }
}
