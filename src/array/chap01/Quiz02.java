package array.chap01;

import java.util.Scanner;

// 배열 a의 모든 요소의 합계를 구하여 반환하는 메서드
public class Quiz02 {

    static int sumOf(int[] arr) {
        int sumAll = 0; // 배열 요소의 합계를 담을 변수
        for (int i : arr) {
            sumAll += i;
        }
        return sumAll;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("요솟수 입력 : ");
        int number = scanner.nextInt();

        int[] arr = new int[number];

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d] : ", i);
            arr[i] = scanner.nextInt();
        }

        int result = sumOf(arr);

        System.out.printf("모든 요소의 합은 %d입니다!", result);
    }

}
