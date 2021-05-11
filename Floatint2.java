public class Floatint2 {
    public static void main(String[] args) {
        System.out.println(add(11,12));
        System.out.println(add(11,32f));
    }
    public static int add(int a, int b){
        int sum = a+b;
        return sum;
    }
    public static float add (int a, float b){
        float sum= a+b;
        return sum;
    }
}
