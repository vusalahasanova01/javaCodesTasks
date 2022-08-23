package algoExpert;

public class TwoNumberSum {
    public static int[] twoNumberSum(int[] array, int targetSum) {
        // Write your code here.
        int [] answer = new int[2];
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length; j++){
                if(Integer.sum(array[i], array[j])==targetSum && i!=j){
                    answer[0]=array[i];
                    answer[1]=array[j];
                    break;
                }
            }
            if(answer[0]==0 && answer[1]==0){
                int[] answer1 = new int[]{};
                return answer1;
            }
        }
        return  answer;
    }

    public static void main(String[] args) {
        int [] example = {-21, 301, 12, 4, 65, 56, 210, 356, 9, -47};
        int[] answer =twoNumberSum(example,164);
        for(int x: answer){
            System.out.println(x);
        }
    }
}
