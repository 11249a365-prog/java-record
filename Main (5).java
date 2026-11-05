/*
Experiment 3(a) - Developing User-Defined Interfaces and Implementation

Aim:
To declare an interface and implement its method in a class.

Algorithm:
1. Declare a Greeting interface with an abstract show method.
2. Implement the interface in Welcome.
3. Override show to display a message.
4. Create a Welcome object using an interface reference and call show.

Compile and run (from this folder):
javac Main.java
java Main

Code:
*/
interface Greeting {
    void show();
}

class Welcome implements Greeting {
    @Override
    public void show() {
        System.out.println("Welcome to Java interfaces.");
    }
}

public class Main {
    public static void main(String[] args) {
        Greeting greeting = new Welcome();
        greeting.show();
    }
}

/*
Output:
Welcome to Java interfaces.
*/
