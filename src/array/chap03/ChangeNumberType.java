package array.chap03;

import java.util.Scanner;

/*기수 : 수를 나타내는 데 기초가 되는 수*/
/*10진법 기준 : 0 1 2 3 4 5 6 7 8 9가 기수이다.*/

/* 입력 받은 10진수를 2진수 ~ 36진수로 기수 변환하는 프로그램 */
public class ChangeNumberType {

    static int change(int no, int cd, char[] cno) {
        int digits = 0; // 변환 후 자릿수
        String dchar = "0123456789ABCDEFGHIJKMNOPQRSTUVWXYZ"; // 기수값들
        do {
            cno[digits++] = dchar.charAt(no % cd); // %로 나머지몫을 구한 뒤 해당 자릿수에 해당하는 값을 배열에 넣는다.
            no /= cd; // 그리고 해당 값을 나누어서 계속 진행합니다.
        } while (no != 0);
        return digits;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int no; // 변환하는 정수
        int cd; // 기수
        int dno; // 변환 후의 자릿수
        int retry; // 기회
        char[] cno = new char[32]; // 배열길이 설정은 2진수를 int최대값으로 돌렸을 때 최대 길이가 32이라고 그렇다.

        System.out.println("10진수를 기수 변환합니다.");
        do {
            do {
                System.out.print("변환하는 음이 아닌 정수 : ");
                no = scanner.nextInt();
            } while (no < 0); // 음수를 넣을 수 없게 설정했다.

            do {
                System.out.print("어떤 진수로 변환할까요? (2 ~ 36) : ");
                cd = scanner.nextInt();
            } while (cd < 2 || cd > 36); // 진수 범위 설정
            
            dno = change(no, cd, cno);

            System.out.print(cd + "진수로는 ");
            for (int i = dno - 1; i >= 0; i--) { // 수가 반대로 입력이 되므로 반대로 출력한다.
                System.out.print(cno[i]);
            }
            System.out.println("입니다.");

            System.out.print("한 번 더 할까요? (1.예/0.아니오) : ");
            retry = scanner.nextInt();
        } while (retry == 1);
    }

}
