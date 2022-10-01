package leetCode;

public class Answer {
    public static int[] removeDuplicates(int[] nums) {
        int [] answer = new int[nums.length];
        answer[0]=nums[0];
        int check = nums[0];
        int k = 1;
        for(int i =1; i< nums.length;i++){
            if (check!=nums[i]){
                answer[k] = nums[i];
                check = nums[i];
                k++;

            }
        }
         return answer;
    }

    public static void main(String[] args) {
        int [] nums = {0,0,1,1,1,2,2,3,3,4};
        int [] answer =(removeDuplicates(nums));

       for(int x: answer){
           System.out.println(x);
       }

    }
}
