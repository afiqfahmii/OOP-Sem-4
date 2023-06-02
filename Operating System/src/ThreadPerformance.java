import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPerformance {
    private static final int ARRAY_SIZE = 100000000;
    private static final double[] array = new double[ARRAY_SIZE];

    public static void main(String[] args) {
        // Initialize array with random values
        Random rand = new Random();
        for (int i = 0; i < ARRAY_SIZE; i++) {
            array[i] = rand.nextDouble() * 10;
        }

        // Single thread
        long start = System.currentTimeMillis();
        double sum = 0;
        for (int i = 0; i < ARRAY_SIZE; i++) {
            sum += Math.sin(array[i]);
        }
        long end = System.currentTimeMillis();
        double timeTaken = (end - start) / 1000.0;
        System.out.println("Single thread: " + timeTaken + " seconds");

        // Multiple threads
        int numThreads = Runtime.getRuntime().availableProcessors();
        int numTasks = numThreads * 4;
        


        // Multiple threads with concurrency but without parallelism
        ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
        CountDownLatch singleThreadLatch = new CountDownLatch(numTasks);
        double[] singleThreadPartialSums = new double[numTasks];

        long startSingleThread = System.currentTimeMillis();
        for (int i = 0; i < numTasks; i++) {
            final int taskIndex = i;
            singleThreadExecutor.submit(() -> {
                int chunkSize = (ARRAY_SIZE + numTasks - 1) / numTasks;
                int startIdx = taskIndex * chunkSize;
                int endIdx = Math.min(ARRAY_SIZE, (taskIndex + 1) * chunkSize);

                // Print information about the task
                System.out.println("Task " + taskIndex + " (Thread: " + Thread.currentThread().getName() +
                        ") working on array indices " + startIdx + " to " + (endIdx - 1));

                for (int j = startIdx; j < endIdx; j++) {
                    singleThreadPartialSums[taskIndex] += Math.sin(array[j]);
                }
                singleThreadLatch.countDown();
            });
        }

        try {
            singleThreadLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        double singleThreadTotalSum = 0;
        for (double partialSum : singleThreadPartialSums) {
            singleThreadTotalSum += partialSum;
        }

        long endSingleThread = System.currentTimeMillis();
        double timeTakenSingleThread = (endSingleThread - startSingleThread) / 1000.0;
        System.out.println("Multiple threads with concurrency but without parallelism: " + timeTakenSingleThread + " seconds");

        singleThreadExecutor.shutdown();


        // Multiple threads using ExecutorService
        ExecutorService executor = Executors.newFixedThreadPool(numThreads);
        CountDownLatch latch = new CountDownLatch(numTasks);
        double[] partialSums = new double[numTasks];
        
        start = System.currentTimeMillis();
        for (int i = 0; i < numTasks; i++) {
            final int taskIndex = i;
            executor.submit(() -> {
                int chunkSize = (ARRAY_SIZE + numTasks - 1) / numTasks;
                int startIdx = taskIndex * chunkSize;
                int endIdx = Math.min(ARRAY_SIZE, (taskIndex + 1) * chunkSize);

                // Print information about the task
                System.out.println("Task " + taskIndex + " (Thread: " + Thread.currentThread().getName() +
                        ") working on array indices " + startIdx + " to " + (endIdx - 1));

                for (int j = startIdx; j < endIdx; j++) {
                    partialSums[taskIndex] += Math.sin(array[j]);
                }
                latch.countDown();
            });
        }

        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        double totalSum = 0;
        for (double partialSum : partialSums) {
            totalSum += partialSum;
        }

        end = System.currentTimeMillis();
        timeTaken = (end - start) / 1000.0;
        System.out.println("Multiple threads with concurrency and parallelism: " + timeTaken + " seconds");
        System.out.println("Number of threads used: " + numThreads);

        executor.shutdown();
    }
}

