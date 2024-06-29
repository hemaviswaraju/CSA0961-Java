import java.util.*;
public class LastWordLength {

    public static void main(String[] args) {
        String s = "Hello World  ";
        System.out.println("The length of the last word is: " + lengthOfLastWord(s));
    }

    public static int lengthOfLastWord(String s) {
        int length = 0;
        int end = s.length() - 1;
        while (end >= 0 && s.charAt(end) == ' ') {
            end--;
        }
        while (end >= 0 && s.charAt(end) != ' ') {
            length++;
            end--;
        }

        return length;
    }
}