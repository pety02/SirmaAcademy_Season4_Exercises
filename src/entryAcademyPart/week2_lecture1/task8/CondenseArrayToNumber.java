package entryAcademyPart.week2_lecture1.task8;

import java.util.Arrays;

public class CondenseArrayToNumber {
    private static int[] condense(int[] nums) {
        if(nums.length == 1) {
            return nums;
        }

        int[] condensed = new int[nums.length - 1];
        int i = 0;
        for (int k = 0; k < condensed.length; k++) {
            condensed[k] = nums[i] + nums[i + 1];
            i++;
        }

        return condense(condensed);
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2,10,3};
        System.out.println(Arrays.toString(condense(nums)));

    }
}
