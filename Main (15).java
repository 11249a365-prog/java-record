/*
Experiment 9(a) - Handling Layouts in Java

Aim:
To arrange Swing components using BorderLayout, FlowLayout and GridLayout.

Algorithm:
1. Create a JFrame on the Swing event dispatch thread.
2. Use BorderLayout for the frame.
3. Create a FlowLayout panel containing two buttons.
4. Create a GridLayout panel containing four labels.
5. Add the panels and a heading to the frame and display it.

Compile and run (from this folder):
javac Main.java
java Main

Code:
*/
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Java Layouts");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(new BorderLayout(10, 10));
            frame.add(new JLabel("Layout Demonstration", JLabel.CENTER), BorderLayout.NORTH);
            JPanel buttons = new JPanel(new FlowLayout());
            buttons.add(new JButton("One"));
            buttons.add(new JButton("Two"));
            JPanel grid = new JPanel(new GridLayout(2, 2, 10, 10));
            grid.add(new JLabel("Cell 1", JLabel.CENTER));
            grid.add(new JLabel("Cell 2", JLabel.CENTER));
            grid.add(new JLabel("Cell 3", JLabel.CENTER));
            grid.add(new JLabel("Cell 4", JLabel.CENTER));
            frame.add(grid, BorderLayout.CENTER);
            frame.add(buttons, BorderLayout.SOUTH);
            frame.setSize(400, 240);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}

/*
Output:
Verified on the Windows desktop with JDK 8.
A "Java Layouts" window displays the heading "Layout Demonstration" at the top,
a 2-by-2 grid of labels Cell 1 to Cell 4 in the center, and One and Two buttons at the bottom.
*/
