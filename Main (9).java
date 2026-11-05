/*
Experiment 5(b) - Multithreading

Aim:
To start two threads concurrently and display messages from both threads.

Algorithm:
1. Define a named Worker thread whose run method prints three messages.
2. Create two Worker objects.
3. Start both threads before waiting for either one.
4. Wait for both threads using join.
5. Display a completion message; the order of worker messages may vary.

Compile and run (from this folder):
javac Main.java
java Main

Code:
*/
class Worker extends Thread {
    Worker(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(getName() + ": " + i);
        }
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Worker first = new Worker("Thread 1");
        Worker second = new Worker("Thread 2");
        first.start();
        second.start();
        first.join();
        second.join();
        System.out.println("Both threads have finished.");
    }
}

/*
Output:
One verified run; worker message order may vary because both threads run concurrently.
Thread 2: 1
Thread 2: 2
Thread 2: 3
Thread 1: 1
Thread 1: 2
Thread 1: 3
Both threads have finished.
*/
