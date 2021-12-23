package array.chap04;

/*1,000이하의 소수를 열거*/
/*같은 문제이더라도 다양한 방법이 존재한다*/
public class PrimeNumber02 {

    public static void main(String[] args) {
        int counter = 0; // 나눗셈의 횟수
        int ptr = 0; // 찾은 소수의 개수
        int[] prime = new int[500]; // 소수를 저장하는 배열

        prime[ptr++] = 2; // 2는 소수이므로 넣고 시작한다.

        for (int i = 3; i <= 1000; i += 2) { // 대상을 홀수로만 잡는다.
            int j;
            for (j = 1; j < ptr; j++) { // 이미 찾은 소수로 나누어본다.
                counter++;
                if (i % prime[j] == 0) { // 나누어떨어지면 소수가 아니다.
                    break;
                }
            }
            if (ptr == j) {
                prime[ptr++] = i; // 소수니까 배열에 저장
            }
        }

        for (int i = 0; i < ptr; i++) {
            System.out.println(prime[i]);
        }

        System.out.println("나눗셈을 수행한 횟수 : " + counter);
    }

}
