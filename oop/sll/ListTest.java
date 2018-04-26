public class ListTest {
    public static void main(String[] args) {
        SLList list = new SLList();
        Node node1 = new Node();
        Node node2 = new Node(2);
        node1.setVal(1);
        list.setHead(node1);
        System.out.println(list.addNode(node2));
        System.out.println(list.addNode(3));
        list.printValues();
        System.out.println(list.removeNode());
        System.out.println(list.removeNode());
        System.out.println(list.removeNode());
        list.printValues();
    }
}