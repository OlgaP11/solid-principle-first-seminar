package srp1;

import srp1.figure.Painter;
import srp1.figure.Point;
import srp1.figure.Square;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(new Point(1,1), 5);
        Painter paint = new Painter (square);
        System.out.printf("Площадь фигуры: %d \n", square.getArea());
        paint.draw(square);
    }
}
