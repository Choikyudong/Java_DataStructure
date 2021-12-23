package array.chap04;


/*1,000이하의 소수를 열거*/
/*소수란 자신과 1이외의 정수로는 나누어떨어지지 않는 정수입니다.*/
/*만약 나누어떨어지는 정수가 하나 이상 존재하면 그 수는 합성수입니다.*/
public class PrimeNumber01 {

    public static void main(String[] args) {
        int counter = 0; // 나눗셈의 횟수
        for (int i = 2; i <= 1000; i++) {
            int j;
            for (j = 2; j < i; j++) {
                counter++;
                if (i % j == 0) { // 나누어 떨어지면 소수가 아님
                    break; // 나누어 떨이지는 것을 확인하면 그 뒤는 필요없다.
                }
            }
            if (i == j) { // 마지막까지 나누어떨이지지 않음
                System.out.println(i);
            }
        }
        System.out.println("나눗셈을 수행한 횟수 : " + counter);
    }

    // 해당 프로그램은 i가 2 또는 3으로 나누어떨어지지 않으면 2 * 2인 4 또는 3 * 3인 6으로도
    // 나누어 떨어지지 않는다. 즉 불필요한 나눗셈을 하고 있어서 개선이 필요하다고 한다.

}
