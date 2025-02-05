package srp2.repository;

import srp2.model.Order;

import java.io.FileWriter;
import java.io.IOException;

public class JsonSaver implements Saver{

    private final Order order;

    public JsonSaver(Order order) {
        this.order = order;
    }

    @Override
    public void save() {
        String fileName = "order.json";
        try (FileWriter writer = new FileWriter(fileName, false)) {
            writer.write("{\n");
            writer.write("\"clientName\":\""+ order.getClientName() + "\",\n");
            writer.write("\"product\":\""+order.getProduct()+"\",\n");
            writer.write("\"qnt\":"+ order.getQuantity() +",\n");
            writer.write("\"price\":"+order.getPrice()+"\n");
            writer.write("}\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
