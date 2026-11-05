/*
Experiment 8(b) - Creation of Color Palette

Aim:
To select colors using AWT buttons in a Java Applet.

Algorithm:
1. Extend Applet and implement ActionListener.
2. Add Red, Green and Blue AWT buttons in init.
3. Register the applet as the listener for each button.
4. Set the selected color and repaint when a button is clicked.
5. Display the selected color name and a filled rectangle.

Compile and run (from this folder):
JDK 8 with appletviewer is required; modern browsers do not run applets.
javac Main.java
appletviewer Main.java

Code:
*/
import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// <applet code="Main.class" width="360" height="220"></applet>
public class Main extends Applet implements ActionListener {
    Color selectedColor = Color.RED;
    String selectedName = "Red";

    @Override
    public void init() {
        setLayout(new FlowLayout());
        setBackground(Color.WHITE);
        String[] names = {"Red", "Green", "Blue"};
        for (String name : names) {
            Button button = new Button(name);
            button.addActionListener(this);
            add(button);
        }
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        selectedName = event.getActionCommand();
        if (selectedName.equals("Red")) {
            selectedColor = Color.RED;
        } else if (selectedName.equals("Green")) {
            selectedColor = Color.GREEN;
        } else {
            selectedColor = Color.BLUE;
        }
        repaint();
    }

    @Override
    public void paint(Graphics graphics) {
        graphics.setColor(Color.BLACK);
        graphics.drawString("Selected color: " + selectedName, 40, 90);
        graphics.setColor(selectedColor);
        graphics.fillRect(40, 110, 240, 70);
    }
}

/*
Output:
Verified with Temurin JDK 8 appletviewer.
The applet displays Red, Green and Blue buttons and initially shows a red rectangle.
Clicking Green shows "Selected color: Green" and a green rectangle.
Clicking Blue shows "Selected color: Blue" and a blue rectangle.
Clicking Red shows "Selected color: Red" and a red rectangle.
*/
