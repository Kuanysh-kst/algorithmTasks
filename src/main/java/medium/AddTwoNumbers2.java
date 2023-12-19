package medium;

public class AddTwoNumbers2 {

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(2);
        listNode1.next = new ListNode(4);
        listNode1.next.next = new ListNode(3);

        ListNode listNode2 = new ListNode(5);
        listNode2.next = new ListNode(6);
        listNode2.next.next = new ListNode(4);

        System.out.println(addTwoNumbers(listNode1, listNode2));

    }


    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int temp = 0;
        ListNode result = new ListNode(l1.val + l2.val);
        while (l1.next != null || l2.next != null) {
            l1 = l1.next;
            l2 = l2.next;
            int sum = l1.val + l2.val + temp;
            temp = 0;

            if (sum%10 == 0){
                sum = 0;
                temp = 1;
            }
            result = new ListNode(sum);
        }
        return result;
    }

    static class ListNode {
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
}
