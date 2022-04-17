package 스레드;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class ExecutorsTest {
    
    public static void main(String[] args) {
        
        Runnable taskA = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("task A: " + i);
            }
        };
        Runnable taskB = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("task B: " + i);
            }
        };

        Executor executor = Executors.newCachedThreadPool();
        executor.execute(taskA);
        executor.execute(taskB);
    }
}
