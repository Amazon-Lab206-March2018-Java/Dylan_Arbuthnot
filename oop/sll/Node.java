public class Node {
    private Integer value;
    private Node next;
    public Node() {
        this.value = null;
        this.next = null;
    }
    public Node(Integer val) {
        this.value = val;
    }
    public void setVal(Integer val) {
        this.value = val;
    }
    public void setNext(Node node) {
        this.next = node;
    }
    public Integer getVal() {
        return this.value;
    }
    public Node getNext() {
        return this.next;
    }
}