public class StringManipulator {
    public String trimAndConcat(String str1, String str2) {
        String str = str1.trim().concat(str2.trim());
        return str;
    }
    public Integer getIndexOrNull(String str, char letter) {
        if (str.indexOf(letter) >= 0) {
            return str.indexOf(letter);
        } else {
            return null;
        }
    }
    public Integer getIndexOrNull(String str1, String str2) {
        if (str1.indexOf(str2) >= 0) {
            return str1.indexOf(str2);
        } else {
            return null;
        }
    }
    public String concatSubstring(String str1, int num1, int num2, String str2) {
        String str = str1.substring(num1, num2).concat(str2);
        return str;
    }
}