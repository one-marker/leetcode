package tasks.arrays;

import java.util.*;
import java.util.stream.Stream;

public class Solution {
    public static int[] plusOne(int[] digits) {
        int a = 1;
        int d = 0;
        for (int i = digits.length-1; i >= 0 ; i--) {
            int sum = digits[i] + a + d;
            digits[i] = sum%10;
            d = sum/10;

            a = 0;
        }
        if (d == 0)
            return digits;
        else {
            int[] digitsPlusOne = new int[digits.length+1];
            digitsPlusOne[0] = 1;
            for (int i = 1; i < digitsPlusOne.length; i++) {
                digitsPlusOne[i] = digits[i-1];
            }
            return digitsPlusOne;
        }
    }
    public static void moveZeroes(int[] nums) {
        for (int i = 0, lastNonZero = 0; i < nums.length ; i++) {
            if (nums[i] != 0) {

               // int tmp = nums[i];
              //  nums[i] = nums[lastNonZero];
               // nums[lastNonZero] = tmp;

                swap(nums, i, lastNonZero);
                lastNonZero++;
            }
        }

    }

    public static void removeDublicate(int[] nums) {
        int tmp = nums[0];
        int k = 0;
        for (int i = 1, lastNonZero = 1; i < nums.length ; i++) {
            if (nums[i] != tmp) {
                tmp = nums[i];
                swap(nums, i, lastNonZero);
                lastNonZero++;
            } else {
                k++;
            }

        }
        System.out.println("Count: " + (nums.length - k));

    }

    private static void swap(int[] arr, int  i1, int i2) {
        int tmp = arr[i2];
        arr[i2] = arr[i1];
        arr[i1] = tmp;
    }


    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m -1;
        int p2 = n - 1;

        for (int p = m + n - 1; p>=0; p--) {
            if (p2 < 0) {
                break;
            }
            if (p1 >= 0 && nums1[p1] > nums2[p2]) {

                nums1[p] = nums1[p1];
                p1--;

            } else {

                nums1[p] = nums2[p2];
                p2--;
            }
        }

    }


    public static void main(String[] args) {
        int[] nums1 = new int[] {1,2,3,0,0,0};
        int[] nums2 = new int[] {2,5,6};

        merge(nums1,3,nums2, 3);
        Arrays.stream(nums1).forEach(x -> System.out.println(x));
        // int[] intsDubl = new int[] {1,2,2,4,4,4,5,6};
        // moveZeroes(ints);
        // removeDublicate(intsDubl);
        // Arrays.stream(ints).forEach(x -> System.out.println(x));
        // Arrays.stream(plusOne(new int[] {9})).forEach(x -> System.out.println(x));

        Deque list = new LinkedList();
        int a = 1;
        int b;
        b = ++a;
        System.out.println(b);
    }
}
