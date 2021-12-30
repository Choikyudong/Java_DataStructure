package search.chap03;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/*array챕터에 chap06에 존재하는 배열에 이진 검색을 수행하기*/
public class PhysExamSearch {

    static class PhysData {
        String name;
        int height;
        double vision;

        // 생성자
        PhysData(String name, int height, double vision) {
            this.name = name;
            this.height = height;
            this.vision = vision;
        }

        // 객체를 문자열로 돌려줘 확인에 용이하게 해주는 메서드
        @Override
        public String toString() {
            return "PhysData{" +
                    "name='" + name + '\'' +
                    ", height=" + height +
                    ", vision=" + vision +
                    '}';
        }

        // 자바에서 상수는 대문자로 써주면 좋다.
        public static final Comparator<PhysData> HEIGHT_ORDER = new HeightOrderComparator();

        // 객체의 대소 관계비교를 위해서 Comparator인터페이스를 구현한다.
        private static class HeightOrderComparator implements Comparator<PhysData> {
            @Override
            public int compare(PhysData o1, PhysData o2) {
                return (o1.height > o2.height) ? 1 : (o1.height < o2.height) ? -1 : 0;
            }
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PhysData[] x = {
                new PhysData("박현규", 162, 0.3),
                new PhysData("함진아", 173, 0.7),
                new PhysData("최윤미", 175, 2.0),
                new PhysData("홍연의", 171, 1.5),
                new PhysData("이수진", 168, 0.4),
                new PhysData("김영준", 174, 1.2),
                new PhysData("박용규", 169, 0.8),
        };
        System.out.print("몇 cm인 사람을 찾나요? : ");
        int height = scanner.nextInt();
        int idx = Arrays.binarySearch(
                x, // 찾고싶은 데이터범위
                new PhysData("", height, 0.0), // 요구사항이 객체타입이기 때문에 객체로
                PhysData.HEIGHT_ORDER // 구현한 비교방식을 넣는다.
        );

        if (idx < 0) {
            System.out.println("요소가 없습니다.");
        } else {
            System.out.println("x[" + idx + "]에 있습니다.");
            System.out.println("찾은 데이터 : " + x[idx]); // toString 메서드가 호출된다.
        }
    }

}


