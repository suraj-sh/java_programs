// 2.5  Create a lambda expression for the Callable interface to be used in multi-threading.
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class LambdaCallable{

    public static void main(String[] args) throws Exception{

        // Create an ExecutorService for managing threads
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        // Define a Callable using a lambda expression
        Callable<Integer> myCallable = () -> {
            // Your code that performs a task
            int result = 0;
            for (int i = 1; i <= 10; i++) {
                result += i;
            }
            return result;
        };

        // Submit the Callable for execution and get a Future object
        Future<Integer> future = executorService.submit(myCallable);

        // Wait for the Callable to complete and get the result
        int result = future.get();

        // Shutdown the ExecutorService
        executorService.shutdown();

        // Print the result
        System.out.println("The result is: " + result);
    }
}
