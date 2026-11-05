/*
Experiment 8(a) - Handling Simple Applet Programs

Aim:
To display text and a rectangle using a Java Applet.

Algorithm:
1. Extend Applet in Main.
2. Set the background color in init.
3. Override paint to draw text and a rectangle.
4. Compile with JDK 8 and open the embedded applet tag using appletviewer.

Compile and run (from this folder):
JDK 8 with appletviewer is required; modern browsers do not run applets.
javac Main.java
appletviewer Main.java

Code:
*/
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

// <applet code="Main.class" width="360" height="180"></applet>
public class Main extends Applet {
    @Override
    public void init() {
        setBackground(Color.WHITE);
    }

    @Override
    public void paint(Graphics graphics) {
        graphics.setColor(Color.BLUE);
        graphics.drawString("Welcome to Java Applets", 40, 60);
        graphics.drawRect(40, 80, 220, 50);
    }
}

/*
Output:
Verified with Temurin JDK 8 appletviewer.
A white applet displays blue text "Welcome to Java Applets" and a blue outlined rectangle.
The viewer reports "Applet started."
*/
