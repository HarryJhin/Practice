package 스레드;

/**
 * Thread 클래스를 상속받은 클래스.
 * run() 메서드를 재작성함.
 */
class ThreadInheritance extends Thread {
    @Override
    public void run() {
        System.out.println("Thread Test");
    }
}

public class ThreadInheritanceTest {

    public static void main(String[] args) {
        
        Thread thread = new ThreadInheritance();

        // Thread Test
        thread.start();

    }

}
