package 컬렉션;

import java.util.HashMap;


/**
 * HashMap 자료 구조를 테스트하는 클래스.
 * HashMap은 key가 입력된 순서를 지키지 않고 정렬되어 입력한 쌍(key, value)이 지켜지지 않음.
 */
public class HashMapTest {
    
    public static void main(String[] args) {
        
        HashMap<Integer, String> hashMap = new HashMap<>();

        // 데이터 삽입 (key, value)
        hashMap.put(1, "one");
        hashMap.put(3, "two");
        hashMap.put(2, "three");

        // {1=one, 2=three, 3=two}
        System.out.println(hashMap);

        // 특정 key와 해당 key의 value 제거
        hashMap.remove(3);

        // {1=one, 2=three}
        System.out.println(hashMap);

        // three
        System.out.println(hashMap.get(2));

        // true
        System.out.println(hashMap.containsKey(1));

        // false
        System.out.println(hashMap.containsValue("two"));

        // 2
        System.out.println(hashMap.size());

        // false
        System.out.println(hashMap.isEmpty());
    }

}
