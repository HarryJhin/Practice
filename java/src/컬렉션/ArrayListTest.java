package 컬렉션;

import java.util.ArrayList;

public class ArrayListTest {

    /**
     * ArrayList<Integer>의 모든 요소를 순차적으로 출력하는 메서드
     * @param list
     */
    public static void printList(ArrayList<Integer> list) {
        for (Integer element : list)
            System.out.print(element + " ");
        System.out.println();
    }

    public static void main(String[] args) {

        /**
         * ArrayList 생성
         */
        ArrayList<Integer> list = new ArrayList<>();

        /**
         * ArrayList의 요소를 순차적으로 추가하기
         */
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        printList(list);

        /**
         * ArrayList의 특정 인덱스 요소를 변경하기
         */
        list.set(4, 1);

        System.out.println("[4]: " + list.get(4));

        /**
         * ArrayList의 특정 인덱스 삭제하기
         */
        list.remove(1);

        printList(list);

        /**
         * 특정 요소가 저장된 인덱스 찾기
         */
        System.out.println(list.indexOf(1));

    }
}
