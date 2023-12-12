package easy;

public class LeangthOfTheLastWord58 {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World"));
        System.out.println(lengthOfLastWord("   fly me   to   the moon  "));
        System.out.println(lengthOfLastWord("luffy is still joyboy"));
    }

    public static int lengthOfLastWord(String s) {
        if (s == null || s.trim().isEmpty()) {
            return 0;
        }
        String[] words = s.split(" ");
        return words[words.length - 1].length();
    }
}
