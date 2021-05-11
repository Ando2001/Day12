import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        int [] arr={1,2,3,4,5};
  //      int number1=random.nextInt();
        // int number1= random.nextInt();
        int[][] matric = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matric[i][j] = random.nextInt(10);
            }
        }
        System.out.println(avarge(arr));
        System.out.println();
        System.out.println(avarge(matric));
    }

    public static double avarge(int[] array) {
        double d = 0;
        for (int i = 0; i <5; i++) {
            d += array[i];
        }
        return d / array.length;
    }

    public static int avarge(int[][] matric) {
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                sum = sum + matric[i][j];
            }
        }
        return sum;
    }
}
