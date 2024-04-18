/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code;

/**
 *
 * @author IT
 */
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

// BorderFactoryExample class demonstrating the usage of BorderFactory
public class BorderFactoryExample extends JFrame {

    public BorderFactoryExample() {
        setTitle("Border Factory Example");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create a JPanel to hold components
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        // Create various borders using BorderFactory
        Border lineBorder = BorderFactory.createLineBorder(Color.blue, 2);
        Border titledBorder = BorderFactory.createTitledBorder("Titled Border");
        Border compoundBorder = BorderFactory.createCompoundBorder(lineBorder, titledBorder);

        // Apply the compound border to the panel
        panel.setBorder(compoundBorder);

        // Add some components to the panel
        JLabel label = new JLabel("Hello, Border Factory!");
        panel.add(label, BorderLayout.CENTER);

        // Add panel to the frame
        add(panel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            BorderFactoryExample example = new BorderFactoryExample();
            example.setVisible(true);
        });
    }
}

