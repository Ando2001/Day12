public class Maximum7 {
    public static void main(String[] args) {
        System.out.println(maximum(4,6));
        System.out.println(maximum(5,9,10));
        System.out.println(maximum(4,6,15,20));
    }
    public static int maximum(int a,int b){
        if (a>b){
            return a;
        }
        return b;
    }
    public static int maximum(int a,int b,int c){
        if (a>b&&a>c){
            return a;
        } else if (b>a&&b>c){
            return b;
        }
        return c;
    }
    public static int maximum(int a, int b, int c,int d){
        if (a>b&&a>c&&a>d){
            return a;
        } else if (b>a&&b>c&&b>d){
            return b;
        } else if (c>a&&c>b&&c>d){
            return c;
        }
        return d;
    }
}
