package leetCode;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int [] answer = new int[2];
        for(int i = 0; i< nums.length; i++){
            for(int j =1; j < nums.length ; j++){
                if(nums[i]+nums[j]==target){
                    answer[0]=nums[i];
                    answer[1] = nums[j];
                }
            }
        }
     return answer;
    }

    public static void main(String[] args) {
        int given [] = {2,7,1,15};
        int [] result = twoSum(given,9);
        for(int x:result){
            System.out.println(x);
        }
    }
}
