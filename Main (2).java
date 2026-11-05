/*
Experiment 1(c) - Handling Strings in Java

Aim:
To demonstrate basic String operations using built-in methods.

Algorithm:
1. Declare two strings.
2. Display the first string and its length.
3. Concatenate the strings.
4. Compare strings using equals.
5. Display uppercase and lowercase forms.

Compile and run (from this folder):
javac Main.java
java Main

Code:
*/
public class Main {
    public static void main(String[] args) {
        String first = "Hello";
        String second = "Java";
        System.out.println("String: " + first);
        System.out.println("Length: " + first.length());
        System.out.println("Concatenation: " + first + " " + second);
        System.out.println("Equal to Hello: " + first.equals("Hello"));
        System.out.println("Equal to Java: " + first.equals(second));
        System.out.println("Uppercase: " + first.toUpperCase());
        System.out.println("Lowercase: " + first.toLowerCase());
    }
}

/*
Output:
String: Hello
Length: 5
Concatenation: Hello Java
Equal to Hello: true
Equal to Java: false
Uppercase: HELLO
Lowercase: hello
*/
