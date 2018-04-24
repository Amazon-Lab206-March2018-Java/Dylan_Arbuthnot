public class StringManipulatorTesting {
    public static void main(String[] args) {
        StringManipulator manipulator = new StringManipulator();
        String str = manipulator.trimAndConcat("    Hello     ","     World    ");
        System.out.println(str);
        char letter = 'W';
        Integer a = manipulator.getIndexOrNull("Coding", letter);
        System.out.println(a);
        String word = "Hello";
        String subString = "whoops";
        Integer b = manipulator.getIndexOrNull(word, subString);
        System.out.println(b);
        String word2 = manipulator.concatSubstring("Hello", 1, 2, "world");
        System.out.println(word2);
    }
}