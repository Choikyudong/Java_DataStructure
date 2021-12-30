package search.chap03;

import java.util.Arrays;
import java.util.Scanner;

/*자바에서 기본적으로 제공하는 배열관련 클래스 Arrays에는 이진 검색이 구현이 되어있다.*/
public class BinarySearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int length = scanner.nextInt();
        int[] arr = new int[length];


        System.out.println("오름차순으로 입력하세요");
        System.out.print("arr[0] : ");
        arr[0] = scanner.nextInt();

        for (int i = 1; i < length; i++) {
            do {
                System.out.print("arr[" + i + "] : ");
                arr[i] = scanner.nextInt();
            } while (arr[i] < arr[i - 1]);
        }

        System.out.print("검색할 값 : ");
        int key = scanner.nextInt();

        // 이전처럼 구현할 필요없이 미리 만들어진걸 사용하니 편하다.
        int idx = Arrays.binarySearch(arr, key);

        // 검색에 성공했는데 값이 중복이 있다면 맨 앞의 값을 반환하거나 그러지는 않는다.
        // 검색에 실패할 경우 찾는값에 근접한 값이 x이면 -x -1의 값으로 반환한다.

        if (idx == -1) {
            System.out.println("그 값의 요소가 없습니다.");
        } else {
            System.out.println(key + "는(은) a[" + idx +"]에 있습니다.");
        }
    }

}
