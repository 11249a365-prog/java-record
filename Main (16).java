/*
Experiment 9(b) - Handling Swing Controls

Aim:
To use Swing controls and handle a button click with ActionListener.

Algorithm:
1. Create a JFrame using FlowLayout on the Swing event dispatch thread.
2. Add a label, text field, checkbox, button and result label.
3. Register an ActionListener on the button.
4. Read the entered name and checkbox state when clicked.
5. Display the name and selected course in the result label.

Compile and run (from this folder):
javac Main.java
java Main

Code:
*/
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Swing Controls");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(new FlowLayout());
            JTextField name = new JTextField(12);
            JCheckBox course = new JCheckBox("Java");
            JButton show = new JButton("Show");
            JLabel result = new JLabel("Enter your name and click Show.");
            show.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent event) {
                    String selection = course.isSelected() ? "Java selected" : "No course selected";
                    result.setText("Name: " + name.getText() + " | " + selection);
                }
            });
            frame.add(new JLabel("Name:"));
            frame.add(name);
            frame.add(course);
            frame.add(show);
            frame.add(result);
            frame.setSize(460, 160);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}

/*
Output:
Verified on the Windows desktop with JDK 8.
A "Swing Controls" window displays a Name field, Java checkbox, Show button and result label.
Sample input: Ravi; Java checkbox selected.
After clicking Show: Name: Ravi | Java selected
*/
