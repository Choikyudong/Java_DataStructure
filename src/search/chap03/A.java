package search.chap03;

import java.util.Arrays;
import java.util.Comparator;

/*자연 정렬로 정렬되지 않는 배열에서 검색을 하기 위해서는 "제네릭 메서드"를 사용해야 한다.*/

/*Arrays.binarySearch()의 세번째 매개변수에 comparator라는것이 존재하는데*/
/*comparator는 객체의 대소 관계를 판단하는 인터페이스이다.*/
public class A {

    // 이렇게 만들어진 comparator를 binarySearch의 3번째 매개변수로 넣으면 된다.
    public static final Comparator<T> COMPARATOR = new Comp();

    private static class Comp implements Comparator<T> {
        @Override
        public int compare(T o1, T o2) {
            return 0;
        }
        // o1이 o2보다 크면 양의 값 반환
        // o1이 o2보다 작으면 음의 값 반환
        // o1과 o2가 같으면 0반환
    }

    static class T {} // 샘플용 클래스

}
