import java.util.*;

public class SLList {
    private Node head;
    private Node tail;
    private static Integer size = 0;
    public SLList() {
        this.head = null;
        this.tail = null;
    }
    public void addHead(Node node) {
        this.head = node;
        size++;
    }
    public void addTail(Node node) {
        this.tail = node;
        size++;
    }
    public Node addNode(int val) {
        Node new_node = new Node(val);
        if (this.head == null) {
            this.head = new_node;
            this.tail = new_node;
        } else {
            Node point = this.head;
            while (point.getNext() != null) {
                point = point.getNext();
            }
            point.setNext(new_node);
            this.tail = new_node;
        }
        size++;
        return this.tail;
    }
    public Node addNode(Node node) {
        if (this.head == null) {
            this.head = node;
            this.tail = node;
        } else {
            Node point = this.head;
            while (point.getNext() != null) {
                point = point.getNext();
            }
            point.setNext(node);
            this.tail = node;
        }
        size++;
        return this.tail;
    }
    public Node removeNode() {
        if (this.head == null) {
            return this.head;
        } else if (this.head.getNext() == null){
            this.head = null;
            this.tail = null;
            return this.head;
        } else {
            Node point = this.head;
            while (point.getNext().getNext() != null) {
                point = point.getNext();
            }
            point.setNext(null);
            this.tail = point;
            size++;
            return this.tail;
        }
    }
    public void printValues() {
        if (this.head == null) {
            System.out.println("null");
        } else {
            Node point = this.head;
            System.out.println(point.getVal());
            while (point.getNext() != null) {
                point = point.getNext();
                System.out.println(point.getVal());
            }
        }
    }
}