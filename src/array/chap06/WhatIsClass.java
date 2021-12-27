package array.chap06;


/*데이터형 클래스의 전반적인 구조*/
public class WhatIsClass {

    // 클래스에 입력되는 값들을 필드라고 한다.
    private int f1;  // 비공개 필드
    protected int f2; // 한정 공개 필드
    public int f3; // 공개 필드

    // 정적 상수 필드 : 상수값들은 대문자로 입력한다.
    static final int S1 = 0;

    // 기본 생성자
    public WhatIsClass() {}
    
    // 오버로딩을 이용해서 매개변수를 받는 생성자
    public WhatIsClass(int f1, int f2, int f3) {
        // this는 해당 클래스를 가르친다. 사용하면 가독성을 높일 수 있다.
        this.f1 = f1;
        this.f2 = f2;
        this.f3 = f3;
    }

    // setter라고 불리는 메서드의 패턴이다. 비공개 필드값에 저장할 수 있다.
    public void setF1(int f1) {
        this.f1 = f1;
    }

    // getter라고 불리는 메서드의 패턴이다. 비공개 필드값을 이용할 수 있다.
    public int getF1() {
        return f1;
    }

    // extends키워드로 상속을 받을 수 있다.
    // 모든 클래스는 Object의 하위클래스이다. 사람 눈에 직접적으로 표시를 안할 뿐
    class InnterClass extends Object {

    }

    // 인터페이스는 공통적으로 사용할 메서드를 정의하는데 주로 사용한다.
    interface MyInterFace {

    }

    // implements로 인터페이스를 구현할 수 있다.
    class MyClassForInterFace implements MyInterFace {

    }

    // 인터페이스와 마찬가지로 공통적으로 사용할 메서드를 정의하는데 사용한다.
    // 클래스이므로 구현하기 위해서는 상속을 이용해야 한다.
    abstract class AbstractClass {

    }

    // 클래스는 원하는대로 중첩이 가능하다.
    class MyClass { // MyInner 를 기준으로 해당 클래스는 아우터클래스(외부클래스)라고 칭한다.

        class MyInner { // MyClass 를 기준으로 해당 클래스는 이너클래스(내부클래스)라고 칭한다.

        }

    }

}
