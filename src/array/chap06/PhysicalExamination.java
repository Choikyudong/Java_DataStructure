package array.chap06;

/*신체검사 데이터용 클래스 배열에서 평균 키와 시력의 분포를 구함*/
public class PhysicalExamination {

    static final int VMAX = 21; // 시력 분표(0.0에서 0.1 단위로 21개)

    // 클래스를 하나의 데이터형태로 사용한다.
    static class PhysData {
        String name;
        int height;
        double vision;

        // 생성자
        PhysData(String name, int height, double vision) {
            this.name = name;
            this.height = height;
            this.vision = vision;
        }
    }

    // 키의 평균값윽 구한다.
    static double aveHeight(PhysData[] dat) {
        double sum = 0;

        // 향상된 for문을 통해서 연산을 수행한다.
        for (PhysData physData : dat) {
            sum += physData.height;
        }
        return sum / dat.length;
    }

    // 시력 분포를 구한다.
    static void distVision(PhysData[] dat, int[] dist) {
        int i = 0;
        dist[i] = 0;
        for (i = 0; i < dat.length; i++) {
            if (dat[i].vision >= 0.0 && dat[i].vision <= VMAX / 10.0) {
                dist[(int)(dat[i].vision * 10)]++;
            }
        }
    }

    public static void main(String[] args) {
        PhysData[] x = {
                new PhysData("박현규", 162, 0.3),
                new PhysData("함진아", 173, 0.7),
                new PhysData("최윤미", 175, 2.0),
                new PhysData("홍연의", 171, 1.5),
                new PhysData("이수진", 168, 0.4),
                new PhysData("김영준", 174, 1.2),
                new PhysData("박용규", 169, 0.8),
        };
        int[] vdist = new int[VMAX]; // 시력 분포

        System.out.println("신체검사 리스트");
        System.out.println("이름       키   시력");
        System.out.println("-------------------");

        for (PhysData physData : x) {
            System.out.printf("%-8s%3d%5.1f\n", physData.name, physData.height, physData.vision);
        }

        System.out.printf("\n평균 키 : %5.1fcm\n", aveHeight(x));

        distVision(x, vdist); // 시력 분포를 구함

        System.out.println("\n시력 분포");
        for (int i = 0; i < VMAX; i++) {
            System.out.printf("%3.1f ~ :%2d명\n", i / 10.0, vdist[i]);
        }
    }

}