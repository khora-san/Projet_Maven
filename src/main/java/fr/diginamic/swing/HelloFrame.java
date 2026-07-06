package fr.diginamic.swing;

import javax.swing.*;
import java.awt.*;

public class HelloFrame extends JFrame {
    public HelloFrame() {
        super("Demo JAR exécutabe");
        JLabel label = new JLabel("HELLO WORLD", SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 48));
        add(label);
        setSize(600, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            HelloFrame frame = new HelloFrame();
            frame.setVisible(true);
        });
    }
}