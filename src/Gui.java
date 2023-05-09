import javax.swing.*;

public class Gui {
    private JPanel Chess;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Gui");
        frame.setContentPane(new Gui().Chess);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
