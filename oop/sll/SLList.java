import java.util.*;

public class SLList {
    private Node head;
    private Node tail;
    private Integer size;
    public SLList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    public void addHead(Node node) {
        this.head = node;
        this.size += 1;
    }
    public void addTail(Node node) {
        this.tail = node;
        this.size += 1;
    }
    public Node addNode(int val) {
        Node new_node = new Node(val);
        if (this.head == null) {
            this.head = new_node;
            this.tail = new_node;
        } else {
            Node point = this.head;
            while (point.next != null) {
                point = point.getNext();
            }
            point.next = new_node;
            this.tail = new_node;
        }
        this.size += 1;
        return this.tail;
    }
    public Node addNode(Node node) {
        if (this.head == null) {
            this.head = node;
            this.tail = node;
        } else {
            Node point = this.head;
            while (point.next != null) {
                point = point.getNext();
            }
            point.next = node;
            this.tail = node;
        }
        this.size += 1;
        return this.tail;
    }
    public Node removeNode() {
        if (this.head == null) {
            return this.head;
        } else if (this.head.next == null){
            this.head = null;
            this.tail = null;
            return this.head;
        } else {
            Node point = this.head;
            while (point.next.next != null) {
                point = point.getNext();
            }
            point.next = null;
            this.tail = point;
            this.size += 1;
            return this.tail;
        }
    }
    public void printValues() {
        if (this.head == null) {
            System.out.println("null");
        } else {
            Node point = this.head;
            System.out.println(point.value);
            while (point.next != null) {
                point = point.getNext();
                System.out.println(point.value);
            }
        }
    }
}