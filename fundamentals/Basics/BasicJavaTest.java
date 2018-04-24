public class BasicJavaTest {
    public static void main(String[] args){
        BasicJava bJ = new BasicJava();
        // System.out.println(bJ.print1To255());
        // System.out.println(bJ.printOddTo255());
        // System.out.println(bJ.printSumTo255());
        int[] myArray = {1, 3, 5, 7, 13, 9};
        int[] myArray2 = {-1, 3, 5, -7, 9, 13};
        // System.out.println(bJ.iterateArray(myArray));
        // System.out.println(bJ.findMax(myArray));
        // System.out.println(bJ.getAvg(myArray));
        // System.out.println(bJ.arrayWithOdds());
        // System.out.println(bJ.greaterThanY(myArray, 7));
        // System.out.println(bJ.squareValues(myArray));
        // System.out.println(bJ.eliminateNegs(myArray2));
        // System.out.println(bJ.minMaxAvg(myArray));
        System.out.println(bJ.shiftArrayValues(myArray));
    }
}