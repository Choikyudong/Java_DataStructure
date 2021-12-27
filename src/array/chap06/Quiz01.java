package array.chap06;

//*시력 분포를 주어진 그래프처럼 출력하도록 작성*/
public class Quiz01 {
    static final int VMAX = 21;

    static class PhysData {
        String name;
        int height;
        double vision;

        PhysData(String name, int height, double vision) {
            this.name = name;
            this.height = height;
            this.vision = vision;
        }
    }

    static double aveHeight(array.chap06.PhysicalExamination.PhysData[] dat) {
        double sum = 0;

        for (array.chap06.PhysicalExamination.PhysData physData : dat) {
            sum += physData.height;
        }
        return sum / dat.length;
    }

    static void distVision(array.chap06.PhysicalExamination.PhysData[] dat, int[] dist) {
        int i = 0;
        dist[i] = 0;
        for (i = 0; i < dat.length; i++) {
            if (dat[i].vision >= 0.0 && dat[i].vision <= VMAX / 10.0) {
                dist[(int) (dat[i].vision * 10)]++;
            }
        }
    }

    public static void main(String[] args) {
        array.chap06.PhysicalExamination.PhysData[] x = {
                new array.chap06.PhysicalExamination.PhysData("박현규", 162, 0.3),
                new array.chap06.PhysicalExamination.PhysData("함진아", 173, 0.7),
                new array.chap06.PhysicalExamination.PhysData("최윤미", 175, 2.0),
                new array.chap06.PhysicalExamination.PhysData("홍연의", 171, 1.5),
                new array.chap06.PhysicalExamination.PhysData("이수진", 168, 0.4),
                new array.chap06.PhysicalExamination.PhysData("김영준", 174, 1.2),
                new array.chap06.PhysicalExamination.PhysData("박용규", 169, 0.8),
        };
        int[] vdist = new int[VMAX];

        System.out.println("신체검사 리스트");
        System.out.println("이름       키   시력");
        System.out.println("-------------------");

        for (array.chap06.PhysicalExamination.PhysData physData : x) {
            System.out.printf("%-8s%3d%5.1f\n", physData.name, physData.height, physData.vision);
        }

        System.out.printf("\n평균 키 : %5.1fcm\n", aveHeight(x));

        distVision(x, vdist);

        System.out.println("\n시력 분포");
        for (int i = 0; i < VMAX; i++) {
            System.out.printf("%3.1f ~ : ", i / 10.0);
            for (int j = 0; j < vdist[i]; j++) { // 존재하는 만큼 출력한다.
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
