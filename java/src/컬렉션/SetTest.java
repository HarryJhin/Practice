package 컬렉션;

import java.util.HashSet;

/**
 * 집합(Set) 자료 구조를 테스트하는 클래스.
 * 집합은 중복된 요소(element)를 허용하지 않음.
 */
public class SetTest {
    
    public static void main(String[] args) {
        
        HashSet<String> set = new HashSet<>();
        String[] str = {"A", "B", "C", "D", "A"};
        for (String s : str)
            if (!set.add(s))
                System.out.println("Duplicate: " + s);

        System.out.println("Non-duplicate: " + set);

        /**
         * 집합 연산 테스트
         * x, y: 피연산자
         * andAll(): 합집합 연산
         * retainAll(): 교집합 연산
         */
        HashSet<String> x = new HashSet<>();
        HashSet<String> y = new HashSet<>();

        x.add("A");
        x.add("B");

        y.add("A");
        y.add("B");
        y.add("C");
        y.add("D");

        HashSet<String> 합집합 = new HashSet<>(x);
        합집합.addAll(y);
        System.out.println(합집합);

        HashSet<String> 교집합 = new HashSet<>(x);
        교집합.retainAll(y);
        System.out.println(교집합);

    }

}
