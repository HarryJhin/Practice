package 컬렉션;

import java.util.LinkedList;

public class LinkedListTest {

    /**
     * LinkedList<Integer>의 모든 요소를 순차적으로 출력하는 메서드
     * @param list
     */
    public static void printList(LinkedList<Integer> list) {
        for (Integer element : list)
            System.out.print(element + " ");
        System.out.println();
    }
    
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        printList(list);

        list.set(4, 1);

        printList(list);

        list.remove(4);

        printList(list);

    }

}
