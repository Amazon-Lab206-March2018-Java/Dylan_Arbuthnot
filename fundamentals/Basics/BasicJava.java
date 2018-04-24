import java.util.Arrays;

public class BasicJava {
    public String void print1To255() {
        for (int i = 1; i < 256; i++) {
            System.out.println(i);
        }
    }
    public String void printOddTo255() {
        for (int i = 1; i < 256; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
    public String void printSumTo255() {
        int sum = 0;
        for (int i = 0; i < 256; i++) {
            sum += i;
            System.out.println("New number: " + i + " Sum: " + sum);
        }
    }
    public String void iterateArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public String findMax(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return "The max of the array is " + max;
    }
    public String getAvg(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double avg = (double) sum / arr.length;
        return "The average of the array is " + avg;
    }
    public String arrayWithOdds() {
        int[] y;
        y = new int[128];
        int x = 0;
        for (int i = 0; i < 256; i++) {
            if (i % 2 != 0) {
            y[x] = i;
            x += 1;
            }
        }
        return Arrays.toString(y);
    }
    public Integer greaterThanY(int[] arr, int y) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > y) {
                count += 1;
            }
        }
        return count;
    }
    public String squareValues(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * arr[i];
        }
        return Arrays.toString(arr);
    }
    public String eliminateNegs(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                arr[i] = 0;
            }
        }
        return Arrays.toString(arr);
    }
    public String minMaxAvg(int[] arr) {
        int min = 0;
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
            sum += arr[i];
        }
        double avg = (double) sum / arr.length;
        String[] new_arr = {"Minimum: " + min, "Maximum: " + max, "Average: " + avg};
        return Arrays.toString(new_arr);
    }
    public String shiftArrayValues(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = 0;
        return Arrays.toString(arr);
    }
}