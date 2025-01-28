package Day19;

import java.util.concurrent.RecursiveTask;
import java.util.concurrent.ForkJoinPool;

class SumTask extends RecursiveTask<Long> {
    private final int start;
    private final int end;
    private static final int THRESHOLD = 10_000;
    public SumTask(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    protected Long compute() {
        if ((end - start) <= THRESHOLD) {
            long sum = 0;
            for (int i = start; i <= end; i++) {
                sum += i;
            }
            return sum;
        } else {

            int mid = (start + end) / 2;
            SumTask leftTask = new SumTask(start, mid);
            SumTask rightTask = new SumTask(mid + 1, end);
            leftTask.fork();
            rightTask.fork();
            long leftResult = leftTask.join();
            long rightResult = rightTask.join();
            return leftResult + rightResult;
        }
    }
}

public class ForkJoinSum {
    public static void main(String[] args) {
        int start = 1;
        int end = 1_000_000;
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        SumTask mainTask = new SumTask(start, end);
        long result = forkJoinPool.invoke(mainTask);
        System.out.println("Sum of numbers from " + start + " to " + end + " is: " + result);
    }
}
