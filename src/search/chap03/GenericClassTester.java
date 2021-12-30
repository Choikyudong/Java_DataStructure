package search.chap03;

/*앞서서 사용했던 <>가 바로 제네릭이라는 것이다.*/
/*제네릭은 처리해야 할 대상의 자료형에 의존하지 않는 클래스 구현 방식이다.*/

/*자바에서 기본으로 제공하는 기능이므로 마음껏 사용하자*/
public class GenericClassTester {

    // T는 별다른 의미는 없고 많은 사람들이 제네력에 T를 사용한다.
    static class GenericClass<T> {
        private T xyz;
        GenericClass(T t) {
            this.xyz = t;
        }
        T getXyz() {
            return this.xyz;
        }
    }

    public static void main(String[] args) {
        // 제네릭은 아래처럼 파라미터에 원하는 값을 넘길 수 있다는 장점이 있다.
        GenericClass<String> string = new GenericClass<>("안녕하세요");
        GenericClass<Integer> integer = new GenericClass<>(200);
        GenericClass<InnerClass> innerClass = new GenericClass<>(new InnerClass());

        System.out.println(string.xyz);
        System.out.println(integer.xyz);
        System.out.println(innerClass.xyz);

        // 이 외에도 제네릭은 더 다양한 기능들이 있으니 따로 공부해야한다.
    }

    static class InnerClass {} // 예시용

}
