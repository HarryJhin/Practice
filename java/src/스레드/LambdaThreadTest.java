package 스레드;

public class LambdaThreadTest {
    
    public static void main(String[] args) {
        
        // 람다식으로 Runnable 인터페이스의 run() 메서드 구현
        Runnable task = () -> System.out.println("Thread Running");
        
        // Thread Running
        new Thread(task).start();

    }

}
