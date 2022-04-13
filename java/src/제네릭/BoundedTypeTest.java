package 제네릭;

/**
 * 한정된 타입 매개 변수(제네릭 타입 인수의 종류를 제한하는 개념)를 테스트하는 클래스
 */
class BoundedType {

    /**
     * 매개 변수(data) 중 가장 큰 값(max)을 구하는 제네릭 메서드
     * @param <T> compareTo()가 있는 타입
     * @param data 배열 또는 리스트
     * @return data의 요소 중 가장 큰 값(max)
     */
    public static <T extends Comparable<T>> T getMax(T[] data) {
        if (data == null || data.length == 0)
            return null;
        T max = data[0];
        for (int i = 1; i < data.length; i++)
            if (max.compareTo(data[i]) < 0)
                max = data[i];
        return max;
    }
}

public class BoundedTypeTest {
    public static void main(String[] args) {
        String[] arr = {"a", "b", "c", "d", "e"};
        System.out.println(BoundedType.getMax(arr));
    }
}
