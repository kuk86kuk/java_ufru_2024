package LABORATORY_WORK_3;



public class Example8 {
    private Node head;

    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // а) с использованием цикла:
    public void createHead(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void createTail(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node current = head;
        while (current != null) {
            sb.append(current.data).append(" ");
            current = current.next;
        }
        return sb.toString();
    }

    public void addFirst(int data) {
        createHead(data);
    }

    public void addLast(int data) {
        createTail(data);
    }

    public void insert(int data, int position) {
        if (position == 0) {
            addFirst(data);
        } else {
            Node newNode = new Node(data);
            Node current = head;
            for (int i = 0; i < position - 1 && current != null; i++) {
                current = current.next;
            }
            if (current != null) {
                newNode.next = current.next;
                current.next = newNode;
            }
        }
    }

    public void removeFirst() {
        if (head != null) {
            head = head.next;
        }
    }

    public void removeLast() {
        if (head == null) return;
        if (head.next == null) {
            head = null;
            return;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
    }

    public void remove(int position) {
        if (head == null) return;
        if (position == 0) {
            removeFirst();
        } else {
            Node current = head;
            for (int i = 0; i < position - 1 && current != null; i++) {
                current = current.next;
            }
            if (current != null && current.next != null) {
                current.next = current.next.next;
            }
        }
    }

    // б) с использованием рекурсии:
    public void createHeadRec(int data) {
        head = createHeadRec(head, data);
    }

    private Node createHeadRec(Node node, int data) {
        if (node == null) {
            return new Node(data);
        } else {
            Node newNode = new Node(data);
            newNode.next = node;
            return newNode;
        }
    }

    public void createTailRec(int data) {
        head = createTailRec(head, data);
    }

    private Node createTailRec(Node node, int data) {
        if (node == null) {
            return new Node(data);
        } else {
            node.next = createTailRec(node.next, data);
            return node;
        }
    }

    public String toStringRec() {
        return toStringRec(head);
    }

    private String toStringRec(Node node) {
        if (node == null) {
            return "";
        } else {
            return node.data + " " + toStringRec(node.next);
        }
    }



    public static void main(String[] args) {
        // Пример использования
        Example8 list = new Example8();
        list.createHead(1);
        list.createHead(2);
        list.createTail(3);
        list.addFirst(4);
        list.addLast(5);
        list.insert(6, 2);
        list.removeFirst();
        list.removeLast();
        list.remove(1);
        System.out.println(list.toString()); // Вывод: 2 6 5
    }
}