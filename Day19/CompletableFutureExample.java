package Day19;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureExample {

    public static void main(String[] args) {
        CompletableFuture<String> userData = CompletableFuture.supplyAsync(() -> {
            simulateDelay(2000);
            return "User{name='John Doe', age=30}";
        });


        CompletableFuture<String> userOrders = CompletableFuture.supplyAsync(() -> {
            simulateDelay(3000);
            return "Orders{[Order1, Order2, Order3]}";
        });

        CompletableFuture<String> userDetailsWithOrders = userData.thenCombine(userOrders, (user, orders) -> {
            return user + "\n" + orders;
        });


        try {
            System.out.println("Fetching details...");
            System.out.println(userDetailsWithOrders.get());
        } catch (InterruptedException | ExecutionException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    private static void simulateDelay(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

