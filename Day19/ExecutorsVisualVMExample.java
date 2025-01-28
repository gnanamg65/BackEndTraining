package Day19;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class PrintTask implements Runnable {
    private final int taskId;

    public PrintTask(int taskId) {
        this.taskId = taskId;
    }

    @Override
    public void run() {
        System.out.println("Task " + taskId + " is being executed by thread " + Thread.currentThread().getName());
        for (int i = 1; i <= 10; i++) {
            System.out.println("Task " + taskId + " - Number: " + i);
            System.out.println("Task " + taskId + " - Thread: " + Thread.currentThread().getName()
            );
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.err.println("Task " + taskId + " was interrupted.");
            }
        }
        System.out.println("Task " + taskId + " has completed.");
    }
}

public class ExecutorsVisualVMExample {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 1; i <= 10; i++) {
            executorService.submit(new PrintTask(i));
        }
        executorService.shutdown();

        System.out.println("All tasks submitted. Monitr threads using VisualVM.");
    }
}

