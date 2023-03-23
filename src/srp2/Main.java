package srp2;

import srp2.model.Order;
import srp2.repository.JsonSaver;
import srp2.repository.Saver;
import srp2.view.ConsoleView;

public class Main {
    public static void main(String[] args) {
        System.out.println("¬ведите заказ:");
        ConsoleView consoleView = new ConsoleView();
        Order order = consoleView.inputFromConsole();
        Saver orderSaver = new JsonSaver(order);
        orderSaver.save();
    }
}
