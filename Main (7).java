/*
Experiment 4(a) - Handling Inheritance in Java

Aim:
To demonstrate inherited methods and method overriding using simple inheritance.

Algorithm:
1. Define a Person parent class with introduce and role methods.
2. Define a Student child class using extends.
3. Override the role method in Student.
4. Create a Student object.
5. Call the inherited introduce method and the overridden role method.

Compile and run (from this folder):
javac Main.java
java Main

Code:
*/
class Person {
    void introduce() {
        System.out.println("Name: Ravi");
    }

    void role() {
        System.out.println("Role: Person");
    }
}

class Student extends Person {
    @Override
    void role() {
        System.out.println("Role: Student");
    }
}

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.introduce();
        student.role();
    }
}

/*
Output:
Name: Ravi
Role: Student
*/
