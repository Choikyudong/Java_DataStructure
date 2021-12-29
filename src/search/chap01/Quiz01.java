package search.chap01;

import java.util.Scanner;

/*while문이 아닌 for문으로 수정하여 작성*/
public class Quiz01 {

    static int seqSearch(int[] a, int n, int key) {
        int i;
        a[n] = key;

        // i를 배열의 기준으로 잡고 보초값이 나올 때 까지 for를 계산한다.
        for (i = 0; a[i] != key; i++);

        // 반복문 완료 후 찾은 값이 원래 값인지 보초인지 판단한다. 보초라면 검색 실패를 의미한다.
        return i == n ? -1 : i;
        
        // 다른 방법
        // 배열의 마지막에는 보초가 있으므로 그전까지 확인을 한다.
        /*for (int j = 0; j < a.length - 1; j++) {
            // 값이 있다면 해당 배열값을 돌려준다.
            if (key == a[j]) {
                return j;
            }
        }*/
        // 만약 끝까지 확인헀는데 없다면 -1(실패값)을 돌려준다.
        //return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int num = scanner.nextInt();
        int[] a = new int[num + 1];

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

