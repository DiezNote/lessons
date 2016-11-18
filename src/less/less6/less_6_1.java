package less.less6;

/**
 * Created by лтд on 18.11.2016.
 */
public class less_6_1 {
    static int Add(int opr1, int opr2){
        return opr1 + opr2;
    }
    static int Minus(int opr1, int opr2){
        return opr1 - opr2;
    }
    static int Mult(int opr1, int opr2){
        return opr1 * opr2;
    }
    static double Dilenie(double opr1, double opr2){
        return opr1 / opr2;
    }
    static int pow(int opr1, int opr2){
        int opr1_1 = opr1;
        for(int i = 2; i <= opr2;i++)
        {
            opr1 = opr1_1 * opr1;
        }
        return opr1;
    }
    public static void main(String[] args) {
        int opr1 = 10;
        int opr2 = 3;

        int sum_res = Add(opr1,opr2);
        int sum_min = Minus(opr1,opr2);
        int sum_mult = Mult(opr1,opr2);
        double sum_dilenie = Dilenie(opr1,opr2);
        int sum_pow = pow(opr1,opr2);
        System.out.println("Сумма :"+sum_res);
        System.out.println("Разность :"+sum_min);
        System.out.println("Умножение :"+sum_mult);
        System.out.println("Диление :"+sum_dilenie);
        System.out.println("Степень :"+sum_pow);
    }
}
