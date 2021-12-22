package array.chap03;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/*배열을 출력시 원본 그대로 출력해라*/
public class Quiz01 {

    static int change(int no, int cd, char[] cno) {
        int digits = 0; // 변환 후 자릿수
        String dchar = "0123456789ABCDEFGHIJKMNOPQRSTUVWXYZ";
        do {
            cno[digits++] = dchar.charAt(no % cd);
            no /= cd;
        } while (no != 0);
        for (int i = 0; i < digits; i++) {
            char temp = cno[i];
            cno[i] = cno[digits - i - 1]; // 자릿수 - i - 1
            cno[digits - i - 1] = temp; // 1을 넣는 이유는 배열의 특성때문
        }
        return digits;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int no; // 변환하는 정수
        int cd; // 기수
        int dno; // 변환 후의 자릿수
        int retry; // 기회
        char[] cno = new char[32];

        System.out.println("10진수를 기수 변환합니다.");
        do {
            do {
                System.out.print("변환하는 음이 아닌 정수 : ");
                no = scanner.nextInt();
            } while (no < 0);

            do {
                System.out.print("어떤 진수로 변환할까요? (2 ~ 36) : ");
                cd = scanner.nextInt();
            } while (cd < 2 || cd > 36);

            dno = change(no, cd, cno);

            System.out.print(cd + "진수로는 ");
            for (int i = 0; i < dno; i++) {
                System.out.print(cno[i]);
            }
            System.out.println("입니다.");

            System.out.print("한 번 더 할까요? (1.예/0.아니오) : ");
            retry = scanner.nextInt();
        } while (retry == 1);
    }

}
