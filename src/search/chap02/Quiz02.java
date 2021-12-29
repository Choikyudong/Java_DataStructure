package search.chap02;

import java.util.Scanner;

/*중복된 값이 있는 배열을 이진 검색으로 할 경우 맨 앞의 요소를 찾는 메서드를 작성하세요*/
public class Quiz02 {

    static int binSearchX(int[] a, int n, int key) {
        int pl = 0; // 검색 범위 첫 인덱스
        int pr = n - 1; // 검색 범위 끝 인덱스

        do {
            int pc = (pl + pr) / 2; // 중앙 요소
            if (a[pc] == key) {
                // 초기값은 pc이며 그리고 중앙값을 줄이며 중앙값이 초기값보다 클 때 동안에 찾는다.
                for (; pc > pl; pc--) {
                    // 만약
                    if (a[pc - 1] < key) {
                        break;
                    }
                }
                return pc; // 모든값이 확인이 된거면 해당 값을 돌린다.
            } else if (a[pc] < key) {
                pl = pc + 1;
            } else {
                pr = pc - 1;
            }
        } while (pl <= pr);

        return -1;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("요솟수 : ");
        int n = scanner.nextInt();
        int[] a = new int[n];

        System.out.println("오름차순으로 입력");

        System.out.print("a[0] : "); // 오름차순이므로 첫번째 비교값을 위해서 첫 요소를 입력
        a[0] = scanner.nextInt();

        for (int i = 1; i < n; i++) {
            do {
                System.out.print("a[" + i + "] : ");
                a[i] = scanner.nextInt();
            } while (a[i] < a[i - 1]); // 앞의 요소보다 작으면 다시 입력
        }

        System.out.print("검색할 값: ");
        int key = scanner.nextInt();

        int idx = binSearchX(a, n, key);

        if (idx == -1) {
            System.out.println("그 값의 요소가 없습니다.");
        } else {
            System.out.println(key + "는(은) a[" + idx +"]에 있습니다.");
        }

    }

}
