public class Array4 {
    public static void main(String[] args) {
        int [] a = {1,3,4,5};
        float [] b = {1.1f,5.5f,9.9f,5.5f};
        double[] c ={4.1,6.1,8.5,9.9};
        array(a);
        System.out.println();
        array(b);
        System.out.println();
        array(c);

    }
    public static void array(int[] a){
        for (int i = 0; i < a.length; i++) {

            System.out.print( a[i] + " ");
        }
    }
    public static void array(float[] b){
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
    }
    public static void array(double[] c){
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }
    }
}
