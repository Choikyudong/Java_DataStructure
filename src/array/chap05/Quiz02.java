package array.chap05;

import java.util.Scanner;

// 그 해의 남은 일 수를 구하는 메서드를 작성
public class Quiz02 {

    // 각 달의 일 수
    static int[][] mdays = {
            {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}, // 평년
            {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}, // 윤년
    };

    // 서기 year년은 윤년인가? (윤년 = 1 / 평년 = 0)
    static int isLeap(int year) {
        return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
    }

    // 숫자를 직접적으로 넣은 이유는 년도의 합을 알기에 반복문을 돌리는 리소스가 아깝다고 판단했음
    static int leftDayOfYear(int year, int month, int day) {
        int checkYear = isLeap(year) == 1 ? 366 : 365;
        while (--month != 0) {
            day += mdays[isLeap(year)][month - 1];
        }
        return checkYear - day;
    }

    // 이렇게 for문을 이용한 방법도 있다.
    /*
    static int leftDayOfYear(int year, int month, int day) {
        int days = day; // 일수
        for (int i = 1; i < month; i++) {
            days += mdays[isLeap(year)][i - 1]; // i가 연산하는 달(month)를 나타내므로 이렇게 넣어준다.
        }
        return 365 + isLeap(year) - days; // 윤년이 되면 날짜가 하루 추가가 되니 이렇게 더하고 구한 일수를 빼면 된다.
    }
    */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int retry;

        do {
            System.out.print("년 : ");
            int year = scanner.nextInt();
            System.out.print("월 : ");
            int month = scanner.nextInt();
            System.out.print("일 : ");
            int day = scanner.nextInt();

            System.out.printf("%d년도는 %d일 남았습니다.\n", year ,leftDayOfYear(year, month, day));

            System.out.print("한 번 더 할까요? (1.예/0.아니오) : ");
            retry = scanner.nextInt();
        } while (retry == 1);
    }

}
