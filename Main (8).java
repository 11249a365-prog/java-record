/*
Experiment 5(a) - Creation of Thread in Java Applications

Aim:
To create and execute a thread by extending Thread.

Algorithm:
1. Define a Worker class extending Thread.
2. Override run to display a message.
3. Create a Worker thread object.
4. Call start to execute run on the new thread.
5. Wait for the worker using join and display completion.

Compile and run (from this folder):
javac Main.java
java Main

Code:
*/
class Worker extends Thread {
    @Override
    public void run() {
        System.out.println("Worker thread is running.");
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Worker worker = new Worker();
        worker.start();
        worker.join();
        System.out.println("Worker thread has finished.");
    }
}

/*
Output:
Worker thread is running.
Worker thread has finished.
*/
