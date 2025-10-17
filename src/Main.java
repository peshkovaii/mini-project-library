import geometry.GeometryMainFrame;

import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            System.out.println("ДЕМО ГРАФИЧЕСКОГО ИНТЕРФЕЙСА БИБЛИОТЕКИ");


            GeometryMainFrame frame = new GeometryMainFrame();
            frame.setVisible(true);
        });
    }
}