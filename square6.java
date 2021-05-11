public class square6 {
    public static void main(String[] args) {
        int shrjan=4;
        square(shrjan);
        float qarakusi=5;
        square(qarakusi);
        int uxx = 5;
        int uxx2=6;
        square(uxx,uxx2);
    }
    public static void square(int n){
        System.out.println(n*n*Math.PI);
    }
    public static void square(float a){
        System.out.println(a*a);
    }
    public static void square(int a,int b){
        System.out.println(a*b);
    }
}
