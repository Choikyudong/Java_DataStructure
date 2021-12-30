package search.chap03;

/*Java 메서드의 종류는 크게 2가지이다.*/
/*인스턴스 메서드(비정적 메서드), 클래스 메서드(정적 메서드)*/
/*인스턴스 메서드는 static키워드가 없고 클래스 메서드는 static키워드가 붙은 메서드이다.*/
public class Id {

    private static int counter = 0;
    private final int id;

    public Id() {
        this.id = ++counter;
    }

    public int getId() {
        return this.id;
    }

    public static int getCounter() {
        return counter;
    }

}

class IdTestr {

    public static void main(String[] args) {
        Id id1 = new Id();
        Id id2 = new Id();

        // static키워드가 없는 메서드인 인스턴스메서드는 "클래스형변수.메서드이름"으로 호출이 가능하다.
        System.out.println("id1의 아이디 : " + id1.getId());
        System.out.println("id2의 아이디 : " + id2.getId());

        // static가 붙은 메서드인 클래스메서드는 "클래스이름.메서드이름"으로 호출이 가능하다.
        System.out.println("부여한 아이디의 개수 : " + Id.getCounter());
    }

}
