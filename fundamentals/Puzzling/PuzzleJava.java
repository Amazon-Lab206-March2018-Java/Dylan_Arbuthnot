import java.util.*;

public class PuzzleJava {
    public ArrayList<Integer> sumNumbers(int[] arr) {
        int sum = 0;
        ArrayList<Integer> y = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 10) {
                y.add(arr[i]);
            }
            sum += arr[i];
        }
        System.out.println(sum);
        return y;
    }
    public String shuffleArray(String[] arr) {
        List<String> strList = Arrays.asList(arr);
        Collections.shuffle(strList);
        arr = strList.toArray(new String[strList.size()]);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        return Arrays.toString(arr);
    }
    public String randomAlpha(String[] arr) {git 
        List<String> alphaList = Arrays.asList(arr);
        Collections.shuffle(alphaList);
        arr = alphaList.toArray(new String[alphaList.size()]);
        String last_letter = arr[arr.length - 1];
        System.out.println(last_letter);
        System.out.println(arr[0]);
        if (arr[0] == "a" || arr[0] == "e" || arr[0] == "i" || arr[0] == "o" || arr[0] == "u") {
            System.out.println("The first letter is " + arr[0] + ", which is a vowel!");
        }
        return "Finished with the random letter!";
    }
    public String randomNum55To100() {
        int min = 55;
        int max = 100;
        int[] y = new int[10];
        int x = 0;
        for (int i = 0; i < 10; i++) {
            int n = (int)(Math.random() * (max - min) + min);
            y[x] = n;
            x += 1;
        }
        return Arrays.toString(y);
    }
    public String num55To100MinMax() {
        int min = 55;
        int max = 100;
        int[] y = new int[10];
        int x = 0;
        for (int i = 0; i < 10; i++) {
            int n = (int)(Math.random() * (max - min) + min);
            y[x] = n;
            x += 1;
        }
        Arrays.sort(y);
        min = y[0];
        max = y[y.length - 1];
        System.out.println("Minimum is: " + min);
        System.out.println("Maximum is: " + max);
        return Arrays.toString(y);
    }
    public String randomString5Letters() {
        String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        StringBuilder builder = new StringBuilder();
        int min = 1;
        int max = 26;
        for (int i = 0; i < 5; i++) {
            int n = (int)(Math.random() * (max - min) + min);
            builder.append(alphabet[n]);
        }
        return builder.toString();
    }
    public String randomStringArray() {
        String[] y = new String[10];
        String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        int min = 1;
        int max = 26;
        for (int i = 0; i < 10; i++) {
            StringBuilder builder = new StringBuilder();
            for (int x = 0; x < 5; x ++) {
                int n = (int)(Math.random() * (max - min) + min);
                builder.append(alphabet[n]);
            }
            y[i] = builder.toString();
        }
        return Arrays.toString(y);
    }
}