package 컬렉션;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 큐 자료 구조를 테스트하는 클래스.
 * 1초에 하나씩 원소를 출력하고 큐에서 삭제.
 */
public class QueueTest {
    
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < 10; i++)
            queue.offer(i);

        while (!queue.isEmpty()) {
            System.out.print(queue.poll() + " ");
        }

    }

}
