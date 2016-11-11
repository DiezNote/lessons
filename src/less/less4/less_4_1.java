package less.less4;

import java.util.Random;

/**
 * Created by лтд on 11.11.2016.
 */
public class less_4_1 {
    public static void main(String[] args) {
        double bank_price[] = new double[10]; //N=10

        for(int i = 0; i < bank_price.length; i++){
            bank_price[i] = 25 + Math.random();
            System.out.println("В банке №"+(i+1)+" курс продажи = "+bank_price[i]);
        }
        double max = bank_price[0];
        int j = 0;
        //for(double var : bank_price){if(var)}
        for(int i = 0; i < bank_price.length; i++) {
            if (bank_price[i] > max) {
                max = bank_price[i];
                j=i;
            }
        }
        System.out.println("Оптимальный банк №"+(j+1)+" с курсом продажи: "+max);
    }
}
