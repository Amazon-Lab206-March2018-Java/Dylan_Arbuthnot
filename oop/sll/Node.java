public class Node {
    public Integer value;
    public Node next;
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
    public Integer getVal() {
        return this.value;
    }
    public Node getNext() {
        return this.next;
    }
}