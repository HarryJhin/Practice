package 스레드;

/**
 * Runnable 인터페이스를 구현한 클래스.
 * run() 메서드를 재작성.
 */
class RunnableTread implements Runnable {
    @Override
    public void run() {
        System.out.println("Runnable interface Test");
    }
}

public class RunnableThreadTest {
    
    public static void main(String[] args) {

        Thread thread = new Thread(new RunnableTread());

        // Runnable interface Test
        thread.start();

    }

}
