package array.chap01;

import java.util.Scanner;

// 배열 요소의 값들을 읽고 역순으로 정렬
public class ReverseArray {
    
    // 배열 요소의 값들을 바꾸는 메서드
    // 자주 사용하는 메서드이니 독립적으로 구현했다.
    // 여기서 int t는 작업용 변수이다.
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    // 배열의 길이를 절반만 정렬하면 되는 이유는
    // 예를들어 {5,4,3,2,1}이라는 배열이 존재할 때
    // 첫번째 for문으로 {1,4,3,2,5}가 될 것이다.
    // 두번째 for문으로 {1,2,3,4,5}가 되고
    // 세번째자리 수는 정렬을 하는것이 의미가 없으므로
    // 정렬이 마무리가 된다.
    static void reverse(int[] a) {
        for (int i = 0; i < a.length/2; i++) {
            swap(a, i,a.length - i - 1);
            // idx2의 이유는 자바에서 배열길이는 0부터 시작하기 때문에 - 1을 해줘야한다.
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

        System.out.println("요소를 역순으로 정렬했습니다.");

        // 확인하기
        for (int i = 0; i < x.length; i++) {
            System.out.println("x[" + i + "] = " + x[i]);
        }
    }

}
