package srp1.figure;

public class Painter implements Brush{
    private final Figure figure;

    public Painter(Figure figure) {
        this.figure = figure;
    }

    @Override
    public void draw(Figure f) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < figure.getSide(); i++) {
            builder.append("* ");
        }
        System.out.println(builder);
        for (int i = 0; i < figure.getSide(); i++) {
            if (i < figure.getSide() - 2) {
                System.out.print("*");
            } else {
                continue;
            }

            for (int j = 1; j < figure.getSide() - 1; j++) {
                System.out.print(" *");
            }
            System.out.println(" *");
        }

        System.out.println(builder);
    }
}
