public class funqciacalculate {
    public static void main(String[] args) {
        System.out.println(calculateDistance(3,4));
        System.out.println(calculateDistance(2,3,4,5));
    }
    public static double calculateDistance(int x,int y){
        double her = Math.sqrt(x*x+y*y);
        return her;
    }

    public static double calculateDistance(int x1,int y1, int x2, int y2){
        double erk = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        return erk;
    }

}
