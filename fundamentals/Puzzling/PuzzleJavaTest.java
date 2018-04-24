public class PuzzleJavaTest {
    public static void main(String[] args) {
        PuzzleJava pJ = new PuzzleJava();
        int[] myArray = {3, 5, 1, 2, 7, 9, 8, 13, 25, 32};
        System.out.println(pJ.sumNumbers(myArray));
        String[] strArr = {"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};
        System.out.println(pJ.shuffleArray(strArr));
        String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        System.out.println(pJ.randomAlpha(alphabet));
        System.out.println(pJ.randomNum55To100());
        System.out.println(pJ.num55To100MinMax());
        System.out.println(pJ.randomString5Letters());
        System.out.println(pJ.randomStringArray());
    }
}