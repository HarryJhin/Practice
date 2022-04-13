package 제네릭;

import java.util.Arrays;
import java.util.List;

/**
 * 상한이 있는 와일드 카드 클래스
 */
class UpperBoundedWildcard {
    /**
     * Number(int, double) 타입 리스트의 요소를 모두 더하는 메서드
     * @param list Number(int, double 포함) 타입 리스트
     * @return result 리스트의 모든 요소를 더한 값
     */
    public static int operator(List<? extends Number> list) {
        int result = 0;

        for (Number n : list)
            result += n.intValue();

        return result;
    }
}

/**
 * 제한이 없는 와일드 카드 클래스
 */
class UnboundedWildcard {
    /**
     * 파라미터 list의 모든 요소를 한 줄로 출력하는 메서드
     * @param list
     */
    public static void operator(List<?> list) {
        for (Object object : list) {
            System.out.print(object + " ");
        }
        System.out.println();
    }
}

/**
 * 하한이 있는 와일드 카드 클래스
 */
class LowerBoundedWildcard {
    /**
     * 파라미터 list의 모든 요소를 한 줄로 출력하는 메서드
     * @param list
     */
    public static void operator(List<? super Integer> list) {
        for (Object object : list) {
            System.out.println(object + " ");
        }
        System.out.println();
    }
}

public class WildcardTest {
    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(1, 2, 3, 4);
        List<Double> list2 = Arrays.asList(1.1, 2.2, 3.3, 4.4);
        List<String> list3 = Arrays.asList("1", "2", "3", "4");
        List<Number> list4 = Arrays.asList(1, 2, 3, 4);
        
        System.out.println(UpperBoundedWildcard.operator(list1));
        System.out.println(UpperBoundedWildcard.operator(list2));

        UnboundedWildcard.operator(list1);
        UnboundedWildcard.operator(list2);
        UnboundedWildcard.operator(list3);

        LowerBoundedWildcard.operator(list4);
    }
}
