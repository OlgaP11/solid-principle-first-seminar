package lsp1.view;

import lsp1.shape.Quadraterial;
import lsp1.shape.Rectangle;

public class ShapeView {
    private final Quadraterial rectangle;

    public ShapeView(Quadraterial rectangle) {
        this.rectangle = rectangle;
    }

    public void showArea() {
        System.out.print("Площадь четырехугольника равна:");
        System.out.println(rectangle.getArea());
    }
}
