package lsp1;

import lsp1.shape.Quadraterial;
import lsp1.shape.Rectangle;
import lsp1.shape.Square;
import lsp1.view.ShapeView;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(5);
        System.out.printf("В квадрате сторона A = %d, сторона B = %d\n",
                square.getSide(), square.getSide());
        ShapeView view = new ShapeView(square);
        view.showArea();

        Rectangle rectangle = new Rectangle(4,5);
        ShapeView view1 = new ShapeView(rectangle);
        view1.showArea();
    }
}
