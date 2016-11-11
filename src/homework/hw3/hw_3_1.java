package homework.hw3;

/**
 * Created by лтд on 10.11.2016.
 */
public class hw_3_1 {
    public static void main(String[] args) {
        int a = 1;
        int b = 4;
        double x;
        double h = 0.5;
        double F_1;
        double F_2;
        double F_3;
        for(x = a; x <= b ;x = x + h)
        {
            F_1 = x - Math.sin(x);
            F_2 = Math.pow(Math.sin(x),2);
            F_3 = 2*Math.cos(x) - 1;
            System.out.printf("%1.1f %1.6f %1.6f %1.6f%n",x,F_1,F_2,F_3);
        }
    }
}
