/*
Experiment 6(b) - Handling User-Defined Exceptions

Aim:
To create and handle a checked exception for age validation.

Algorithm:
1. Define InvalidAgeException extending Exception.
2. Declare a validation method that throws this exception for ages below 18.
3. Call the method with age 16 inside try.
4. Catch the custom exception and display its message.

Compile and run (from this folder):
javac Main.java
java Main

Code:
*/
class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message);
    }
}

public class Main {
    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be at least 18.");
        }
        System.out.println("Valid age.");
    }

    public static void main(String[] args) {
        try {
            checkAge(16);
        } catch (InvalidAgeException exception) {
            System.out.println(exception.getMessage());
        }
    }
}

/*
Output:
Age must be at least 18.
*/
