package array.chap05;

/*2행 4열의 2차원 배열*/
public class Int2DArray {

    public static void main(String[] args) {
        int[][] x = new int[2][4];
        x[0][1] = 37;
        x[0][3] = 54;
        x[1][2] = 65;

        for (int[] i : x) {
            for (int j : i) {
                System.out.printf("[%2d] ", j);
            }
            System.out.println();
        }
    }

}
