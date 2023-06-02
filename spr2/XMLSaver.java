package spr2;
import java.io.FileWriter;
import java.io.IOException;

public class XMLSaver implements SaveTo {

    private final Order order;

    public XMLSaver(Order order) {
        this.order = order;
    }

    @Override
    public void save() {
        String fileName = "order.xml";
        try (FileWriter writer = new FileWriter(fileName, false)) {
            writer.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
            writer.write("<order>\n");
            writer.write("<clientName>" + order.getClientName() + "</clientName>\n");
            writer.write("<product>" + order.getProduct() + "</product>\n");
            writer.write("<qnt>" + order.getQnt() + "</qnt>\n");
            writer.write("<price>" + order.getPrice() + "</price>\n");
            writer.write("</order>\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }

}