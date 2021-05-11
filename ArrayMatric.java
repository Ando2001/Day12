import java.util.Random;
import java.util.Scanner;

public class ArrayMatric {
    public static void main(String[] args) {
        Random random = new Random();
      //  int number = random.nextInt();
        int[][] matric = new int[4][4];
        for (int i = 0; i < matric.length; i++) {
            for (int j = 0; j < matric.length; j++) {
                matric[i][j] = random.nextInt(15  );
            }
        }
        //int[] aray = {1, -3, 0, 9, -9};
        //System.out.println(array())
        int [] matric1 = array(matric);
        for (int i = 0; i < matric1.length; i++) {
            System.out.print(matric1[i] + " ");
        }
        System.out.println();
        int [] matric2 = array(matric);
        for (int i = 0; i < matric2.length; i++) {
            matric2[i]=-matric2[i];
            System.out.print(matric2[i] + " ");
        }
    }

    public static int[] array(int[][] matr) {
        int[] array = new int[matr.length];
        for (int i = 0; i < matr.length; i++) {
            int sum = 0;

            for (int j = 0; j < matr.length; j++) {
                //sum+=matr[i][j];
                sum += matr[i][j];
            }
            array[i] = sum/matr[i].length;
//            sum = 0;
        }
        return array;
    }

    public static int[] array(int[] array) {
        int [] arr = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arr[i]=-array[i];
        }
        return arr;
    }
}
