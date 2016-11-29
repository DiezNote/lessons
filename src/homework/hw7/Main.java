package homework.hw7;

/**
 * Created by лтд on 25.11.2016.
 */
public class Main {
    public static void main(String[] args) {
        Point p1 = new Point("A",3,6);
        Point p2 = new Point("B",1,1);
        Point p3 = new Point("C",6,2);
        Point p4 = new Point("D",6,5);
        Point p5 = new Point("E",4,7);
        Figure F1 = new Figure(p1,p2,p3);
        Figure F2 = new Figure(p1,p2,p3,p4);
        Figure F3 = new Figure(p1,p2,p3,p4,p5);

        System.out.println(F1.getPerimetr()+" "+F1.getNameOfFigure()+" "+F1.getTypeOfFigure());
        System.out.println(F2.getPerimetr()+" "+F2.getNameOfFigure()+" "+F2.getTypeOfFigure());
        System.out.println(F3.getPerimetr()+" "+F3.getNameOfFigure()+" "+F3.getTypeOfFigure());
    }
}
