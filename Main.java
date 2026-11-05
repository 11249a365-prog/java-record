/*
Experiment 1(a) - For Understanding Reference to an Instance of a Class (Object), Methods

Aim:
To create an object and call methods using object references.

Algorithm:
1. Define a Student class with name and age instance variables.
2. Declare a method to display student details.
3. Create a Student object and assign values.
4. Assign its reference to another variable.
5. Call the method using both references and compare them.

Compile and run (from this folder):
javac Main.java
java Main

Code:
*/
class Student {
    String name;
    int age;

    void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Ravi";
        student.age = 19;
        Student reference = student;
        student.display();
        reference.display();
        System.out.println("Same object: " + (student == reference));
    }
}

/*
Output:
Student Name: Ravi
Student Age: 19
Student Name: Ravi
Student Age: 19
Same object: true
*/
