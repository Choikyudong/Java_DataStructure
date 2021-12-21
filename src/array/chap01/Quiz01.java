package array.chap01;
import java.util.Scanner;

/* 배열 요소를 역순으로 정렬하는 과정을 하나하나 나타내는 프로그램 */
public class Quiz01 {

    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
        printSomething(idx1, idx2);
    }

    static void printSomething(int idx1, int idx2) {
        System.out.printf("a[%d]과(와) a[%d]를 교환합니다.\n",idx1, idx2);
    }

    static void printArrayBefore(int[] x) {
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
        System.out.println();
    }

    static void reverse(int[] x) {
        for (int i = 0; i < x.length / 2; i++) {
            printArrayBefore(x);
            swap(x, i, x.length - i - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("요솟수 : ");
        int number = scanner.nextInt(); // 요솟수 입력

        int[] x = new int[number]; // 입력한 요솟수로 배열자리를 지정

        // 배열에 들어갈 숫자 입력
        for (int i = 0; i < x.length; i++) {
            System.out.print("x[" + i + "] : ");
            x[i] = scanner.nextInt();
        }

        reverse(x); // 배열 역순메서드 실행

        System.out.println("역순 정렬을 마쳤습니다.");
    }

}
