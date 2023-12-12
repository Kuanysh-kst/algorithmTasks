package easy;

public class AddBinary67 {
    public static void main(String[] args) {
        String a, b, c, d;
        a = "11";
        b = "1";

        System.out.println("result is : " + addBinary(a, b));

        c = "1010";
        b = "1011";

        System.out.println("result is :" + addBinary(c, b));
    }

    public static String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        while (i >= 0 || j >= 0 || carry == 1) {
            if (i >= 0) {
                carry += a.charAt(i--) - '0';
                System.out.println("carry i: " + carry);
            }
            if (j >= 0) {
                carry += b.charAt(j--) - '0';
                System.out.println("carry j: " + j);

            }
            sb.append(carry % 2);

            carry = carry / 2;
        }
        return sb.reverse().toString();
    }
}
