package array.chap05;

import java.util.Scanner;

/*dayOfYear를 변수 i와 days없이 구현하세요*/
public class Quiz01 {

    // 각 달의 일 수
    static int[][] mdays = {
            {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}, // 평년
            {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}, // 윤년
    };

    // 서기 year년은 윤년인가? (윤년 = 1 / 평년 = 0)
    static int isLeap(int year) {
        return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
    }

    // while로 구현을 한다.
    static int dayOfYear(int year, int month, int day) {
        while (--month != 0) { // 기존의 코드와는 다르게 12월에서 1월로 내려가는 형식이다.
            day += mdays[isLeap(year)][month - 1]; // 기존의 입력된 날(day)에 배열값을 더하면 끝
        }
        return day;
    }

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

            System.out.printf("그 해 %d일째입니다.\n", dayOfYear(year, month, day));

            System.out.print("한 번 더 할까요? (1.예/0.아니오) : ");
            retry = scanner.nextInt();
        } while (retry == 1);
    }

}
