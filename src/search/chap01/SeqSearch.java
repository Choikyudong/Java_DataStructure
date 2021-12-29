package search.chap01;


import java.util.Scanner;

/*검색알고리즘 중에 하나인 선형 검색(linear search)*/
/*순차 검색(sequential search)라고도 불린다.*/
/*찾고싶은 요소를 원하는 배열에서 처음부터 끝까지 검색하는 알고리즘*/
public class SeqSearch {

    // 요솟수가 n인 배열 a에서 key와 같은 요소를 선형 검색한다.
    static int seqSearch(int[] a, int n, int key) {
        int i = 0;

        while (true) {
            if (i == n) {
                return -1; // 검색실패
            }
            if (a[i] == key) {
                return i; // 검색성공
            }
            i++;
        }
    }

    // 해당 알고리즘의 종료 조건은 2가지다.
    // 1. 검색값을 발견하지 못하고 배열의 끝을 지나간다.
    // 2. 검색값을 발견한다.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int num = scanner.nextInt();
        int[] a = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("a[" + i + "] : ");
            a[i] = scanner.nextInt();
        }

        System.out.print("검색할 값 : ");
        int key = scanner.nextInt();

        int idx = seqSearch(a, num, key);

        if (idx == -1) {
            System.out.println("해당 값은 배열에 존재하지 않습니다.");
        } else {
            System.out.println(key + "은(는) a[" + idx + "]에 있습니다.");
        }
    }

}
