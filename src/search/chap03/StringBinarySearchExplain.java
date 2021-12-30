package search.chap03;

/*String 배열이 이진 검색이 가능한 이유는*/

/*String 클래스가 가지고 있는 Comparable<T> 인터페이스와 compareTo 메서드 때문이다.*/
/*만약 전에 배열을 자연스럽게 정렬을 할려면 아래와 같이 메서드를 정의하면 된다.*/
public class StringBinarySearchExplain implements Comparable<StringBinarySearchExplain> {

    // 필드 , 메서드가 있따
    
    @Override
    public int compareTo(StringBinarySearchExplain o) {
        // this가 c보다 크면 양의 값 반환
        // this가 c보다 작으면 음의 값 반환
        // this가 c와 같으면 0반환

        return 0; // 오류 방지용
    }

    @Override
    public boolean equals(Object obj) {
        // this가 c와 같으면 true 반환
        // this가 c와 같지않으면 false 반환

        return true; // 오류 방지용
    }
    
}
