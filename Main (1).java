/*
Experiment 1(b) - Handling Arrays, Control Statements and Operators

Aim:
To use integer arrays, operators, if-else statements and for loops.

Algorithm:
1. Declare an integer array and initialize the sum to zero.
2. Access each array element using a for loop.
3. Add each value to the sum and use the remainder operator to check parity.
4. Display whether each value is even or odd.
5. Calculate and display the sum and average.

Compile and run (from this folder):
javac Main.java
java Main

Code:
*/
public class Main {
    public static void main(String[] args) {
        int[] numbers = {10, 15, 20, 25};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            if (numbers[i] % 2 == 0) {
                System.out.println(numbers[i] + " is even");
            } else {
                System.out.println(numbers[i] + " is odd");
            }
        }
        double average = (double) sum / numbers.length;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}

/*
Output:
10 is even
15 is odd
20 is even
25 is odd
Sum: 70
Average: 17.5
*/
