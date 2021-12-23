package array.chap04;

/*1,000이하의 소수를 열거*/
public class PrimeNumber03 {

    public static void main(String[] args) {
        int counter = 0;
        int ptr = 0;
        int[] prime = new int[500];

        prime[ptr++] = 2; // 2는 소수이므로 넣고 시작한다.
        prime[ptr++] = 3; // 3은 소수이므로 넣고 시작한다.

        for (int i = 5; i <= 100; i += 2) { // 대상을 홀수로만 잡는다.
            boolean flag = false;
            for (int j = 1; prime[j] * prime[j] <= i; j++) {
                counter += 2; // 2씩 증가시키는 이유는 위의 곱셉과 밑의 나눗셈의 수행횟수를 계산하기 위해서
                if (i % prime[j] == 0) { // 나누어떨어지면 소수가 아니다.
                    flag = true;
                    break;
                }
            }
            if (!flag) { // true일 경우 마지막까지 나누어떨이지지 않는다는 말이다.
                prime[ptr++] = i; // 소수라고 배열에 저장
                counter++;
            }
        }

        for (int i = 0; i < ptr; i++) {
            System.out.println(prime[i]);
        }

        System.out.println("곱셉과 나눗셈을 수행한 횟수 : " + counter);
    }

}
