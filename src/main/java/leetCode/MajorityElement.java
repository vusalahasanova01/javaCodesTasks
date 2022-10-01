package leetCode;

public class MajorityElement {
    static int answer;
    public static int majorityElement(int[] nums) {
        int secondnumber = 0;

        for (int i = 0; i < nums.length ; i++) {
            int selectednumber = 0;
            for (int j = 0; j <nums.length ; j++) {
                if(i!=j){
                    if(nums[i]==nums[j] && i<j){
                        selectednumber++;
                    }
                    else{
                        if(selectednumber>secondnumber){
                            answer = nums[i];
                            secondnumber = selectednumber;
                        }
                        else{
                            answer = nums[i];
                        }
                    }
                }
            }

        }
        return answer;
    }
    public static void main(String[] args) {
        int[] nums = {3,2,3};
        System.out.println(majorityElement(nums));
    }
}
