/*
Experiment 3(b) - Use of Predefined Interfaces

Aim:
To implement the predefined Comparable interface to compare student marks.

Algorithm:
1. Define a Student class implementing Comparable<Student>.
2. Store each student name and marks.
3. Implement compareTo using Integer.compare.
4. Create an array of students and sort it using Arrays.sort.
5. Display students in ascending order of marks.

Compile and run (from this folder):
javac Main.java
java Main

Code:
*/
import java.util.Arrays;

class Student implements Comparable<Student> {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(marks, other.marks);
    }
}

public class Main {
    public static void main(String[] args) {
        Student[] students = {new Student("Ravi", 78), new Student("Meena", 92),
                              new Student("Sara", 66)};
        Arrays.sort(students);
        for (Student student : students) {
            System.out.println(student.name + ": " + student.marks);
        }
    }
}

/*
Output:
Sara: 66
Ravi: 78
Meena: 92
*/
