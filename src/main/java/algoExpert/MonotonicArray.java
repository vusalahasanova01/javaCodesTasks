package algoExpert;


public class MonotonicArray {
    static int j, k = 0;

    public static boolean isMonotonic(int[] array) {
        // Write your code here.
        if(array.length <= 2)return true;
        boolean increasing = true;
        boolean decreasing = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i+1] ) {
                    decreasing = false;
                } else if(array[i] < array[i+1]){
                    increasing = false;
                }
                if( !decreasing && !increasing) return false;
            }
          return true;
        }


    public static void main(String[] args) {
        int[] arr = new int[]{-1,-5,-10,-1100,-900,-1101,-1102,-9001};
        System.out.println(arr.length);
        boolean result = isMonotonic(arr);
        System.out.println(result);
    }
}
