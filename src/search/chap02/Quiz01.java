package search.chap02;

import java.util.Scanner;

/*배열에 존재하는 값의 인덱스 주소를 가져오세요*/
public class Quiz01 {

    static int searchIdx(int[] a, int n, int key, int[] y) {
        // y배열의 배열주소를 다루는 변수
        int idx = 0;

        // 모든 요소가 들어간 배열인 a로 key값이 있는지 확인한다.
        for (int i = 0; i < n; i++) {
            if (a[i] == key) {
                // 배열 y에 일치하는 값의 인덱스값을 넣고 증감연산자로 배열주소를 높인다.
                y[idx++] = i;
            }
        }

        // 값이 0이라면 값이 없다는것이며 값이 존재한다면 값이 들어있는데까지 확인이 가능한 배열길이가 리턴된다.
        return idx;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int num = scanner.nextInt();
        int[] x = new int[num];
        int[] y = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "] : ");
            x[i] = scanner.nextInt();
        }

        System.out.print("찾는 값 : ");
        int key = scanner.nextInt();

        int idx = searchIdx(x, num, key, y);

        if (idx == 0) {
            System.out.println("없는 값입니다.");
        } else {
            for (int i = 0; i < idx; i++) {
                System.out.println("그 값은 " + "x[" + y[i] + "]에 있습니다.");
            }
        }
    }


}
