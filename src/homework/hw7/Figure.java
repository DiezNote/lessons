package homework.hw7;

/**
 * Created by лтд on 25.11.2016.
 */
public class Figure {
    Point p[];
    private double perimetr = 0;
    private String name="";
    private String type;

    Figure(Point A, Point B, Point C) {
        p = new Point[3];
        p[0] = A;
        p[1] = B;
        p[2] = C;

        name += p[0].point_name + p[1].point_name + p[2].point_name;
        type = "Triangle";
        PFor3Point();
    }

    Figure(Point A, Point B, Point C, Point D) {
        p = new Point[4];
        p[0] = A;
        p[1] = B;
        p[2] = C;
        p[3] = D;

        name += p[0].point_name + p[1].point_name + p[2].point_name + p[3].point_name;
        type = "Quadrangle";
        PFor4Point();
    }

    Figure(Point A, Point B, Point C, Point D, Point E) {
        p = new Point[5];
        p[0] = A;
        p[1] = B;
        p[2] = C;
        p[3] = D;
        p[4] = E;

        name += p[0].point_name + p[1].point_name + p[2].point_name + p[3].point_name + p[4].point_name;
        type = "Pentagon";
        PFor5Point();
    }

    double LenghtSide(Point A, Point B) {
        double fig_side = 0;
        fig_side = Math.sqrt(Math.pow((A.x - B.x), 2) + Math.pow((A.y - B.y), 2));
        return fig_side;
    }

    void PFor3Point() {
        perimetr += LenghtSide(p[0], p[1]);
        perimetr += LenghtSide(p[1], p[2]);
        perimetr += LenghtSide(p[2], p[0]);
    }

    void PFor4Point() {
        perimetr += LenghtSide(p[0], p[1]);
        perimetr += LenghtSide(p[1], p[2]);
        perimetr += LenghtSide(p[2], p[3]);
        perimetr += LenghtSide(p[3], p[0]);
    }

    void PFor5Point() {
        perimetr += LenghtSide(p[0], p[1]);
        perimetr += LenghtSide(p[1], p[2]);
        perimetr += LenghtSide(p[2], p[3]);
        perimetr += LenghtSide(p[3], p[4]);
        perimetr += LenghtSide(p[4], p[0]);
    }

    Double getPerimetr() {return perimetr;}

    String getNameOfFigure() {return name;}

    String getTypeOfFigure() {return type;}

}
