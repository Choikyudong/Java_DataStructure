package search.chap03;

import java.util.Arrays;
import java.util.Scanner;

/*문자열의 배열에서 검색하기*/
public class StringBinarySearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Java에서 사용하는 키워드(예약어)입니다.
        String[] arr = {
                "abstract", "assert", "boolean", "break", "byte",
                "case", "catch", "char", "class", "const",
                "continue", "default", "do", "double", "else",
                "enum", "extends", "final", "finally", "float",
                "for", "goto", "if", "implements", "import",
                "instanceof", "int", "interface", "long", "native",
                "new", "package", "private", "protected", "public",
                "return", "short", "static", "strictfp", "super",
                "switch", "synchronized", "this", "throw", "throws",
                "transient", "try", "void", "volatile", "while",
        };

        System.out.print("원하는 키워드를 입력하세요 : ");
        String key = scanner.nextLine();

        int idx = Arrays.binarySearch(arr, key);

        if (idx < 0) {
            System.out.println("해당 키워드가 없습니다.");
        } else {
            System.out.println("해당 키워드는 " + (idx + 1) + "번째에 있습니다.");
        }

        /*곰곰히 생각해보면 BinarySearch(이진 검색)은 값이 오름차순이든 내림차순이든*/
        /*정렬이 되어있어야 하는데 해당 배열은 아무값이나 나열이 되어있어서 정렬이라고 부르기에는 어렵다.*/

        /*지금까지 알고있는 기준으로는 해당 배열에는 이진 검색이 불가능해야하는데 왜 되는걸까?*/
        
    }
    

}
