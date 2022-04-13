package 제네릭;

/**
 * Test
 * 제네릭 필드와 제네릭 메서드를 테스트하는 클래스
 */
class Test<T> {
    private T data;

    /**
     * data 필드를 세팅하는 메서드
     * @param data 제네릭
     */
    public void setData(T data) {
        this.data = data;
    }

    /**
     * data 필드를 리턴하는 메서드
     * @return data 필드 값
     */
    public T getData() {
        return data;
    }
}

public class GenericTest {
    public static void main(String[] args) {

        Test<String> t1 = new Test<>();
        t1.setData("String");
        System.out.println(t1.getData());

        Test<Double> t2 = new Test<>();
        t2.setData(3.14);
        System.out.println(t2.getData());

    }
}
