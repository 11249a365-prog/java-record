/*
Experiment 2(a) - Developing User-Defined Packages in Java

Aim:
To define a custom package and import its public class in another class.

Algorithm:
1. Create the labpackage directory.
2. Define the public Greeting class and show method in that package.
3. Import labpackage.Greeting into Main.
4. Create a Greeting object and call show.

Compile and run (from this folder):
javac Main.java labpackage/Greeting.java
java Main

Code:
*/
import labpackage.Greeting;

public class Main {
    public static void main(String[] args) {
        Greeting greeting = new Greeting();
        greeting.show();
    }
}

/*
Output:
Hello from a user-defined package.
*/
