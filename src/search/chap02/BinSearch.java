package search.chap02;

import java.util.Scanner;

/*이진 검색은 찾고자 하는 데이터를 검색범위를 좁혀 가면서 찾는 방식이다.*/
/*전제 조건은 데이터가 정렬이 되어있다는 것이다. 그래서 이진 검색은 선형 검색보다 더 빠르다는게 장점이다.*/
public class BinSearch {

    static int binSearch(int[] a, int n, int key) {
        int pl = 0; // 검색 볌위의 첫 인덱스
        int pr = n - 1; // 검색 범위의 끝 인덱스
        
        do {
            int pc = (pl + pr) / 2; // 중앙 요소의 인덱스
            if (a[pc] == key) {
                return pc; // 검색 성공
            } else if (a[pc] < key) {
                pl = pc + 1; // 검색 범위를 뒤쪽 절반으로 좁힌다.
            } else {
                pr = pc - 1; // 검색 범위를 앞쪽 절반으로 좁힘
            }
        } while (pl <= pr);
        
        return -1; // 검색 실패
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

        int idx = binSearch(a, n, key);

        if (idx == -1) {
            System.out.println("그 값의 요소가 없습니다.");
        } else {
            System.out.println(key + "는(은) a[" + idx +"]에 있습니다.");
        }

    }

}
