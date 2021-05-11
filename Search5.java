public class Search5 {
    public static void main(String[] args) {
    int [] array = {1,2,3,4,5};
    int b = 5;
    int c = 4;
        System.out.println(array(array));
        System.out.println(array(array,b));
        System.out.println(array(array,b,c));
    }
    public static int array(int [] a){
        return a.length;
    }
    public static int array(int[]  b,int n){

        for (int i = 0; i < b.length; i++) {
         if (b[i]==n){
             return i;
         }
        }
        return -1;
    }
        public static boolean array(int[] arr, int n,int a){

            for (int i = 0; i <arr.length; i++) {
                if (arr[i]==n&&a==i){
                    return true;
                }
            }
            return false;
        }
}
