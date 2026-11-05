/*
Experiment 7 - File Operations in Java

Aim:
To create a file, write text and read its contents using Java file classes.

Algorithm:
1. Create a new lab-output.txt file without overwriting an existing file.
2. Write one line using a BufferedWriter and close it automatically.
3. Read the file using a BufferedReader.
4. Display each line and close the reader automatically.
5. Catch IOException and display an error message.

Compile and run (from this folder):
javac Main.java
java Main

Code:
*/
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Main {
    public static void main(String[] args) {
        Path file = Paths.get("lab-output.txt");
        try {
            try (BufferedWriter writer = Files.newBufferedWriter(file,
                    StandardCharsets.UTF_8, StandardOpenOption.CREATE_NEW)) {
                writer.write("Welcome to Java file handling.");
                writer.newLine();
            }
            System.out.println("File created and written: " + file);
            try (BufferedReader reader = Files.newBufferedReader(file, StandardCharsets.UTF_8)) {
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            }
        } catch (IOException exception) {
            System.out.println("File error: " + exception.getMessage());
        }
    }
}

/*
Output:
File created and written: lab-output.txt
Welcome to Java file handling.

The run creates lab-output.txt in the working directory.
If that file already exists, the program reports a file error and preserves it.
*/
