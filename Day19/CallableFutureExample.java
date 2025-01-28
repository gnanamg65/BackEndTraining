package Day19;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ExecutionException;

class FactorialTask implements Callable<Long> {
    private final int number;

    public FactorialTask(int number) {
        this.number = number;
    }

    @Override
    public Long call() throws Exception {
        return calculateFactorial(number);
    }

    private Long calculateFactorial(int num) {
        long result = 1;
        for (int i = 2; i <= num; i++) {
            result *= i;
        }
        return result;
    }
}

public class CallableFutureExample {
    public static void main(String[] args) {
        int number = 10;
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        FactorialTask task = new FactorialTask(number);
        Future<Long> future = executorService.submit(task);

        try {
            Long result = future.get();
            System.out.println("The factorial of " + number + " is: " + result);
        } catch (InterruptedException | ExecutionException e) {
            System.err.println("Error occurred while computing factorial: " + e.getMessage());
        } finally {

            executorService.shutdown();
        }
    }
}

