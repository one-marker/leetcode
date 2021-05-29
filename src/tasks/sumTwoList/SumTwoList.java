package tasks.sumTwoList;

//Сложить два списка (доделать)
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode tmp = l1;
        int d = 0;
        while (l1 != null) {
            int sum = l1.val + l2.val + d;
            if (sum >= 10) {
                sum = sum%10;
                d = 1;
            }
            l1.val = sum;
            l1 = l1.next;
            l2 = l2.next;

        }
        return tmp;
    }
}

public class SumTwoList {

    static void print(ListNode l) {
        while (l != null) {
            System.out.print(l.val);
            l = l.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {

        ListNode first1 = new ListNode(2);
        ListNode first2 = new ListNode(4);
        ListNode first3 = new ListNode(3);

        first1.next = first2;
        first2.next = first3;
        first3.next = null;

        ListNode second1 = new ListNode(5);
        ListNode second2 = new ListNode(6);
        ListNode second3 = new ListNode(7);

        second1.next = second2;
        second2.next = second3;

        Solution solution = new Solution();

        print(first1);
        print(second1);
        ListNode res = solution.addTwoNumbers(first1, second1);


        print(res);



    }
}
