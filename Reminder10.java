import java.util.Scanner;

public class Reminder10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int number2= scanner.nextInt();
        System.out.println(reminder(number));
        System.out.println(reminder(number,number2));
    }
    public static int reminder(int n){
        int sum =0;
        while (n!=0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
    public static int reminder(int a,int b)
    {
        int sum = 0;
        while (a!=0){
            sum+=a%10;
            a/=10;
        }
        return sum%b;
    }
}
