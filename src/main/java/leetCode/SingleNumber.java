package leetCode;

import java.util.ArrayList;

public class SingleNumber {


    public static int singleNumber(int[] nums) {
        int answer;
        for (int i = 0; i < nums.length; i++) {
            boolean result = false;
            for (int j = 0; j < nums.length; j++) {
                if (result) break;
                if (nums[i] == nums[j] && i != j) {
                    result = true;

                }
            }
            if (!result) return answer = nums[i];
        }

        return nums[nums.length - 1];
    }

    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2};
        System.out.println(singleNumber(nums));
    }

}
