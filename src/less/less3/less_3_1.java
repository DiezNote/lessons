package less.less3;

/**
 * Created by лтд on 08.11.2016.
 */
public class less_3_1 {
    public static void main(String[] args) {
        long a = 123456789;
        long chislo = 0;
        //int ch[] = new int[9];
        for(int i = 1;i < 10; i++)
        {
            chislo = 9 * i;
            System.out.println("Результат умножения "+chislo+" на "+a+" = "+chislo*a );
        }
    }
}
