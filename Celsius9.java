import java.util.Scanner;

public class Celsius9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        float celsius= scanner.nextFloat();
        System.out.println(fanraheitcelsius(number));
        System.out.println(fanraheitcelsius(celsius));

    }

    public static int fanraheitcelsius(float cels) {
    float faren = (cels*9/5)+32;
    int fraim = (int) faren;
    return fraim;
    }
    public static double fanraheitcelsius(int cels){
    double faren = (cels*9/5)+32;
    return faren;
    }
}
