/*
Experiment 6(a) - Handling Predefined Exceptions

Aim:
To handle ArithmeticException using try, catch and finally.

Algorithm:
1. Declare a numerator and a zero denominator.
2. Attempt division inside try.
3. Catch ArithmeticException and display a suitable message.
4. Execute finally and display its message.

Compile and run (from this folder):
javac Main.java
java Main

Code:
*/
public class Main {
    public static void main(String[] args) {
        int numerator = 10;
        int denominator = 0;
        try {
            System.out.println(numerator / denominator);
        } catch (ArithmeticException exception) {
            System.out.println("Cannot divide by zero.");
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}

/*
Output:
Cannot divide by zero.
Finally block executed.
*/
