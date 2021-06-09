package tasks.longestSubarray;

import java.util.ArrayList;
import java.util.List;

public class Solution {


    public int longestSubarray(int[] nums) {
        int index1 = 0;
        int tmp = 0;
        int max = 0;
        boolean zero = false;
        int zeroCount = 0;
        for (int i = 0; i <  nums.length; i++)
            if (nums[i] == 0)
                zeroCount++;

        for (int index2 = 0; index2 < nums.length; index2++) {
            if (nums[index2] == 0 || index2 == (nums.length - 1)) {
                if (!zero) {
                    tmp = index2;
                    zero = true;
                } else if (zero) {
                    zero = false;
                    int res = index2 - index1 - 1;
                    if (index2 == nums.length - 1 && nums[index2] == 1) {
                        res = index2 - index1;
                    }

                    if (res >= max)
                        max = res;

                    index2 = tmp;
                    index1 = tmp + 1;
                }
            }
        }
        if (zeroCount == nums.length)
            return 0;
        if (zeroCount == 0)
            return (nums.length - 1);
        return max;
    }

    public static void main(String[] args) {
        System.out.println("Start");
        Solution solution = new Solution();
        //int[] arr = {0,1, 1, 0, 1, 0, 1, 1, 0, 1};
        int[] arr = {1,0,0,1,0};
        System.out.println(solution.longestSubarray(arr));
    }
}


