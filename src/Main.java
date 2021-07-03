import tasks.tree.Solution;
import tests.Tests;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Stream;

//class Solution {
//
//    int sum(int [] arr, int left , int right) {
//        int sum = 0;
//        if (left  == right) {
//            return arr[0];
//        } else {
//            if (left == right - 1) {
//                return arr[left]  + arr[right];
//            } else {
//                int mid = left + (right - left) / 2;
//                int l = sum(arr, left, mid);
//                int r = sum(arr, mid + 1, right);
//                return l + r;
//            }
//        }
//
//    }
//    int sum2(List<Integer> list) {
//
//        if (list.isEmpty()) {
//            return 0;
//        } else if (list.size() == 1) {
//            return list.get(0);
//        }
//        int head = list.get(0);
//        list.remove(0);
//        return head + sum2(list);
//
//    }
//
//}

class User implements Comparable {


    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
public class Main {

    public static List<String> summaryRanges(int[] nums) {

        List<User> list1 = new ArrayList<>();
        list1.sort(new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return 0;
            }
        });
        List<String> list = new ArrayList<>();

        for (int i = 0, j = 0; j < nums.length; j++) {
            if (j + 1 < nums.length && nums[j + 1] == nums[j] + 1)
                continue;
            // put the range [nums[i], nums[j]] into the list
            if (i == j)
                list.add(nums[i] + "");
            else
                list.add(nums[i] + "->" + nums[j]);
            i = j + 1;

        }
//        int tmpIndex = 0;
//        int prev = nums[0];
//        for (int i = 0; i < nums.length; i++) {
//
//            System.out.println("index " + i);
//            if ((nums[i] - prev <= 1 ) && (i != nums.length-1)) {
//                prev = nums[i];
//            } else {
//                System.out.println(tmpIndex + " " + (i-1));
//                tmpIndex = i;
//                prev = nums[i];
//            }
//        }
        return list;

    }

    public static void quickSort(int[] arr, int from, int to) {
        if (from < to) {
            int divide = partition(arr, from, to);
            quickSort(arr, from, divide - 1);
            quickSort(arr, divide, to);
        }
    }

    public static int partition(int[] arr, int from, int to) {
        int leftIndex = from;
        int rightIndex = to;
        int pivot = arr[from];
        while (leftIndex <= rightIndex) {
            while (arr[leftIndex] < pivot) {
                leftIndex++;
            }
            while (arr[rightIndex] > pivot) {
                rightIndex--;
            }

            if (leftIndex <= rightIndex) {
                swap(arr, leftIndex, rightIndex);
                leftIndex++;
                rightIndex--;
            }
        }

        return leftIndex;
    }

    public static void swap(int[] arr, int i1, int i2) {
        int tmp = arr[i2];
        arr[i2] = arr[i1];
        arr[i1] = tmp;
    }

    public static int lengthOfLongestSubstringTwoDistinct(String s) {
        int max;
        int count = 0;
        char[] str = s.toCharArray();


        char char1 = str[0];
        char char2 = str[0];
        int i1 = 0;
        int i2 = 0;
        while (i2 < str.length) {

            // char1 = str[i1];
            while (i1 < str.length) {
                if (str[i1] == char1) {

                    count++;
                } else {
                    if (i1 < str.length)
                        char2 = str[i1];

                    break;
                }
                i1++;
            }
            i2 = i1;
            while (i2 < str.length) {
                if (str[i2] == char2) {

                    count++;
                } else {
                    if (i2 < str.length)
                        char1 = str[i1];
                    break;
                }
                i2++;
            }
            count = 0;

        }
        return count;
    }

    public static int check() {
        try {
            //return  1;
            throw new Error();
        } catch (Exception e) {
            return 2;
        } finally {
            return 3;
        }
    }

    public static void intersect(int[] nums1, int[] nums2) {


        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0, j = 0;
        while (i < nums1.length && j < nums2.length ) {
            if (nums1[i] == nums2[j]) {
                System.out.println(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] > nums2[j]) {
                j++;

            } else {
                i++;
            }

        }


    }


    public static void intersect2(int[] nums1, int[] nums2) {


        HashMap<Integer, Integer> nums1Map = new HashMap<>();

        for (int i = 0; i < nums1.length; i++) {
            if (nums1Map.containsKey(nums1[i])) {
                int v = nums1Map.get((nums1[i]));
                nums1Map.replace(nums1[i], ++v);
            } else {
                nums1Map.put(nums1[i], 1);
            }
        }

        for (int j = 0; j < nums2.length; j++) {
            if (nums1Map.containsKey(nums2[j])) {
                int v = nums1Map.get((nums2[j]));
                if (v > 0) {
                    nums1Map.replace(nums2[j], --v);
                    System.out.println(nums2[j]);
                }
            }
        }
        Iterator itr = nums1Map.keySet().iterator();
        while (itr.hasNext()) {
           // Map.Entry entry = (Map.Entry) itr.next();
            //получить ключ
            Integer key = (Integer) itr.next();
            System.out.println(key);
            //получить значение
           // Integer value = (Integer) entry.getValue();
        }
    }

    class User {
        String string;
        int h;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            User user = (User) o;
            return h == user.h &&
                    Objects.equals(string, user.string);
        }

        @Override
        public int hashCode() {
            return Objects.hash(string, h);
        }
    }

    public static <T> T[] convert(Class<T> clazz, List<T> values) {
        T[] array = (T[]) Array.newInstance(clazz, values.size());
        return null;
    }
    static class Contract {
        int id;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }
    }
    static class Shop {
        int id;
        Contract contract;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Contract getContract() {
            return contract;
        }

        public void setContract(Contract contract) {
            this.contract = contract;
        }
    }
    public static void main(String[] args)  {



        String[] strings = convert(String.class,
                Arrays.asList("val",
                "23",
                "1")
        );

        int[] arr = {1, 1, 2, 5,7};
        int[] arr1 = {1, 2, 3, 5};
        //  summaryRanges(arr).stream().forEach(x-> System.out.println(x));

        //  System.out.println(lengthOfLongestSubstringTwoDistinct("aabbbbcc"));

        //intersect2(arr, arr1);

        Shop shop = new Shop();
        shop.setContract(new Contract());
        if ( shop == null || shop.getContract() == null) {
            System.out.println("true");
        }

//        try {
//            throw new Exception();
//        } catch (Exception e) {
//            throw new Exception();
//            //e.printStackTrace();
//        } finally {
//            throw new Exception();
//        }
//        HashMap<Integer,Integer> map = new HashMap<>();
//        int[] in = {4,2,3,5,6};
//
//
//        map.put(1,1);
//        map.put(1,2);
//        map.put(3,3);
//        System.out.println(map.size());
//        System.out.println(map.remove(1));
//        System.out.println(map.containsValue(2));
//        quickSort(in, 0, in.length-1);
//       // System.out.println(partition(in, 0, in.length-1));
//        for (int i:
//             in) {
//            System.out.print(i);
//        }
    }
//    public static void main(String[] args) {
//        int[] in = {1,2,3,5,6};
//
//        List list = new ArrayList<Integer>() {{
//            add(1);
//            add(2);
//            add(3);
//            add(4);
//        }};
//
//        Solution solution = new Solution();
//       // System.out.println(solution.sum(in,0,5));
//        System.out.println(solution.sum2(list));
//
//    }


}
