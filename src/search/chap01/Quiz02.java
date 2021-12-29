package search.chap01;

import java.util.Scanner;

/*선형 검색의 스캐닝 과정을 상세하게 출력하세요*/
public class Quiz02 {

    // 이렇게 변경하면 출력시 조금 더 깔끔하다.
    static int seqSearch(int[] a, int n, int key) {

        System.out.print("   |");
        for (int i = 0; i < n; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println();

        System.out.print("---+");
        for (int i = 0; i < 4 * n + 2; i++) {
            System.out.print("-");
        }
        System.out.println();

        for (int i = 0; i < n; i++) {
            System.out.print("   |");
            System.out.printf(String.format("%%%ds*\n", (i * 4) + 3), "");
            System.out.printf("%3d|", i);
            for (int k = 0; k < n; k++) {
                System.out.printf("%4d", a[k]);
            }
            System.out.println("\n   |");
            if (a[i] == key)
                return i;
        }
        return -1;
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
