package array.chap02;

import java.util.Scanner;

/* 배열 b의 모든 요소를 배열 a에 역순으로 복사하는 메소드 rcopy를 작성 */
public class Quiz02 {

    
    static void rcopy(int[] a, int[] b) {
        // 반대로 복사를 해야하니까
        // a는 마지막 길이부터 넣는 방법
        for (int i = 0; i < b.length; i++) {
            a[a.length - i - 1] = b[i];
        }

        // 정상적으로 a의 첫번째 배열에
        // b의 마지막값을 넣는 방법(차이점은 없는듯)
        /*
        for (int i = 0; i < a.length; i++) {
            a[i] = b[b.length - i - 1];
        }
        */
    }

    static void printArr(int[] a) {
        for (int i : a) {
            System.out.println(i);
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

        rcopy(a, b);
        printArr(a);
    }

}
