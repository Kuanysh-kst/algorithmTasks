package patterns;

public class FloydCycleDetection {

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = head.next;

        boolean hasCycle = detectCycle(head);
        System.out.println("Цикл есть в списке :" + hasCycle);
        System.out.println(1+2+"3");
    }

    static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    //Функция для обнаружения цикла
    private static boolean detectCycle(Node head) {
        Node slow = head;
        Node fast = head;

    return false;
    }
}
