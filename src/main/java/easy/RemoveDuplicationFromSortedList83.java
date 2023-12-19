package easy;

public class RemoveDuplicationFromSortedList83 {
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        ListNode list2 = new ListNode(1, list1);
        ListNode list3 = new ListNode(2, list2);
        ListNode list4 = new ListNode(3, list3);
        ListNode list5 = new ListNode(3, list4);

        printList(list5);

        list5 = deleteDuplicates(list5);

        System.out.println();
        printList(list5);
        System.out.println(1+2+"3");

    }


    public static ListNode deleteDuplicates(ListNode head) {
        return null;
    }

//    public static ListNode deleteDuplicates(ListNode head) {
//        if (head == null || head.next == null) {
//            return head;
//        }
//        ListNode slow = head;
//        ListNode fast = head.next;
//
//        while (fast != null) {
//            if (slow.val == fast.val) {
//                slow.next = fast.next;
//            } else {
//                slow = slow.next;
//            }
//
//            fast = fast.next;
//        }
//        return head;
//    }

    private static void printList(ListNode list) {
        while (list != null) {
            System.out.print(list.val + " ");
            list = list.next;
        }
    }

    public static class ListNode {
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
