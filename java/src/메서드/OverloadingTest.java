package 메서드;

/**
 * Test
 * 메서드 오버로딩을 위한 클래스
 */
class Test {

    /**
     * 파라미터 x, y를 더한 값을 리턴하는 메서드
     * @param x 정수
     * @param y 정수
     * @return x + y 연산 결과값
     */
    int operator(int x, int y) {
        return x + y;
    }

    /**
     * 파라미터 x, y를 나눈 값을 리턴하는 메서드
     * @param x 실수
     * @param y 실수
     * @return x / y 연산 결과값
     */
    double operator(double x, double y) {
        return x / y;
    }
}

public class OverloadingTest {
    public static void main(String[] args) {
        Test op = new Test();
        System.out.println(op.operator(3, 3));
        System.out.println(op.operator(5.2, 1.3));
    }
}
