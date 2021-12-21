package array.chap02;

import java.util.Scanner;

/* 배열 b의 모든 쇼로를 배열 a에 복사하는 메소드 copy를 작성 */
public class Quiz01 {

    static boolean equals(int[] a, int[] b) {
        if (a.length != b.length) {
            return false;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }

    static void copy(int[] a, int[] b) {
        for (int i = 0; i < b.length; i++) {
            a[i] = b[i];
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("배열 a의 요솟수 : ");
        int lengthForA = scanner.nextInt();
        int[] a = new int[lengthForA];

        System.out.println("배열 b의 요솟수 : ");
        int lengthForB = scanner.nextInt();

        int[] b = new int[lengthForB];

        System.out.println("배열 b의 숫자 입력");
        for (int i = 0; i < b.length; i++) {
            System.out.print("b[" + i + "] : ");
            b[i] = scanner.nextInt();
        }

        copy(a, b);
        System.out.println(equals(a,b));
    }

}
