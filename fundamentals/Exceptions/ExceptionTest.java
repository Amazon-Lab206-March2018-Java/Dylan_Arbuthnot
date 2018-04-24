import java.util.*;

public class ExceptionTest {
    public static void main(String[] args) {
        Exception eX = new Exception();
        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("13");
        myList.add("hello world");
        myList.add(48);
        myList.add("Goodbye World");
        System.out.println(eX.iterateList(myList));
    }
}