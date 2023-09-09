import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        JFrame jframe = new JFrame("AutoSty_JavaEdition");
        jframe.setLayout(new FlowLayout());
        jframe.setSize(500,500);
        jframe.add(new JLabel("Label test"));
        jframe.add(new JButton("Bouton"));
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setVisible(true);
    }
}