public class Over1 {
    public static void main(String[] args) {
        System.out.println(add(10,6));
        System.out.println(add(14,15,16));
    }
    public static int add(int a,int b){
        int sum = 0;
        sum=a+b;
        return sum;
    }
    public static int add(int a,int b, int c){
        int sum = 0;
        sum = a+ b+c;
        return sum;
    }
}
