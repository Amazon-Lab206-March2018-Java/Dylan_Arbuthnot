import java.util.*;

public class Exception {
    public String getString() {
        return "hello";
    }
    public ArrayList<Integer> iterateList(ArrayList<Object> arr) {
        ArrayList<Integer> y = new ArrayList<Integer>();
        for (Object value : arr) {
            try {
                Integer castedValue = (Integer) value;
                System.out.println(castedValue);
                y.add(arr.indexOf(value), castedValue);
            } catch (ClassCastException e) {
                Integer castedValue = (Integer) arr.indexOf(value);
                y.add(arr.indexOf(value), castedValue);
            }
        }
        System.out.println(arr);
        return y;
    }
}