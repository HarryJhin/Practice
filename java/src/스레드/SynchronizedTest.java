package 스레드;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 셰프와 고객이 공유하는 코스 요리 클래스(버퍼).
 */
class Course {

    /**
     * 셰프가 조리(생산)하고 고객이 먹을(가져가는) 요리들(데이터).
     */
    private Queue<String> foods;
    final static int MAX = 10;

    /**
     * true: 셰프가 요리를 완성할 때까지 손님이 기다리는 중.
     * false: 손님이 먹을 때까지 셰프가 기다리는 중.
     */
    private boolean condition;

    public Course() {
        foods = new LinkedList<>();
        condition = true;
    }

    /**
     * 고객이 요리를 먹는 메서드.
     * @return food
     */
    public synchronized String getFood() {
        while(condition) {
            try {
                wait();
            } catch (InterruptedException e) {}
        }
        condition = true;
        notifyAll();
        return foods.poll();
    }

    /**
     * 셰프가 요리를 만드는 메서드.
     * @param data
     */
    public synchronized void makedFood(String food) {
        while (!condition) {
            try {
                wait();
            } catch (InterruptedException e) {}
        }
        foods.offer(food);
        condition = false;
        notifyAll();
    }
}

/**
 * 셰프(생산자) 클래스.
 * 스레드 실행을 위해 Runnable 인터페이스를 구현.
 */
class Chef implements Runnable{

    private Course course;

    public Chef(Course course) {
        this.course = course;
    }

    @Override
    public void run() {
        for (int i = 0; i < Course.MAX; i++) {
            String food = "[" + i + "] food";
            System.out.println("Chef: " + food + " make");
            course.makedFood(food);
            try {
                Thread.sleep((int)(Math.random() * 100));
            } catch (InterruptedException e) {}
        }
    }

}

/**
 * 손님(소비자) 클래스.
 * 스레드 실행을 위해 Runnable 인터페이스를 구현.
 */
class Client implements Runnable {

    private Course course;

    public Client(Course course) {
        this.course = course;
    }

    @Override
    public void run() {
        for (int i = 0; i < Course.MAX; i++) {
            String food = course.getFood();
            System.out.println("Client: " + food + " eat");
            try {
                Thread.sleep((int) (Math.random() * 100));
            } catch (InterruptedException e) {}
        }
    }
}

/**
 * 셰프(생산자)-손님(소비자) 관계를 표현하는 클래스.
 */
public class SynchronizedTest {
    public static void main(String[] args) {
        Course course = new Course();
        (new Thread(new Chef(course))).start();
        (new Thread(new Client(course))).start();
    }
}
