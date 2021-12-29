package search.chap01;

import java.util.Scanner;

public class SeqSearchV2 {

    // 기존에 존재하던 검색 반복을 for문으로 교체
    static int seqSearch(int[] a, int n, int key) {
        for (int i = 0; i < n; i++) {
            if (a[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int num = scanner.nextInt();
        int[] a = new int[num];

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

