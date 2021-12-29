package search.chap01;

import java.util.Scanner;

/*선형검색은 실행할 때마다 종료조건 2가지를 모두 판단한다.*/
/*단순한 판단이라고 생각할 수 있지만 계속해서 반복되면 종료 조건 검사비용을 무시할 수 없다.*/

/*이 비용을 절반으로 줄이는 방법이 "보초법"(sentinel method)이다.*/
public class SeqSearchSen {

    static int seqSearch(int[] a, int n, int key) {
        int i = 0;
        a[n] = key; // 보초를 추가

        while (true) {
            if (a[i] == key) {
                break;
            }
            i++;
        }
        return i == n ? -1 : i; // 반복문 완료 후 찾은 값이 원래 값인지 보초인지 판단한다. 보초라면 검색 실패를 의미한다.
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int num = scanner.nextInt();
        int[] a = new int[num + 1]; // 보초를 넣기위해서 요솟수를 하나 증가시킨다.

        for (int i = 0; i < num; i++) {
            System.out.print("a[" + i + "] : ");
            a[i] = scanner.nextInt();
        }

        System.out.print("검색할 값 : ");
        int key = scanner.nextInt();

        int idx = seqSearch(a, num, key);

        if (idx == -1) {
            System.out.println("해당 값은 배열에 존재하지 않습니다.");
        } else {
            System.out.println(key + "은(는) a[" + idx + "]에 있습니다.");
        }
    }

}
