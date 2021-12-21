package array.chap02;

import java.util.Scanner;

/* 두 배열이 같은지 판단하는 클래스 */
public class CompareArray {
    
    static boolean equals(int[] a, int[] b) {
        if (a.length != b.length) { // 우선 길이를 먼저 확인을 한다.
            return false;
        }
        for (int i = 0; i < a.length; i++) { // 둘의 길이가 같다고 했으니까 a로 해도 문제없다.
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("배열 a의 요솟수 : ");
        int lengthForA = scanner.nextInt();

        int[] a = new int[lengthForA];

        System.out.println("배열 a의 숫자 입력");
        for (int i = 0; i < a.length; i++) {
            System.out.print("a[" + i + "] : ");
            a[i] = scanner.nextInt();
        }

        System.out.println("배열 b의 요솟수 : ");
        int lengthForB = scanner.nextInt();

        int[] b = new int[lengthForB];

        System.out.println("배열 b의 숫자 입력");
        for (int i = 0; i < b.length; i++) {
            System.out.print("b[" + i + "] : ");
            b[i] = scanner.nextInt();
        }

        System.out.println("결과는 " + equals(a, b) + "입니다!");
    }
    
}
