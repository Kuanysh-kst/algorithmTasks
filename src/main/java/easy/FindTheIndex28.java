package easy;

public class FindTheIndex28 {
    public static void main(String[] args) {

        System.out.println(strStr("leetcode", "leeto"));
        System.out.println(strStr("sadbutsad", "sad"));
        System.out.println(strStr("abc", "c"));
        System.out.println(strStr("mississippi", "issipi"));
    }

    public static int strStr(String haystack, String needle) {

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            int count = 0;
            for (int j = 0; j < needle.length(); j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                }
                count++;
            }

            if (count == needle.length()) {
                return i ;
            }
        }
        return -1;
    }
}
