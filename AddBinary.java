public class AddBinary {
    public static String addBinary(String a, String b) {
        int len1 = a.length();
        int len2 = b.length();
        int carry = 0; 
        String res = "";
        // the final length of the result depends on the bigger length between a 
        // and b, 
        // (also the value of carry, if carry = 1, add "1" at the head of result, 
        // otherwise) 
        int maxLen = Math.max(len1, len2); 
        for (int i = 0; i < maxLen; i++) { 
            // start from last char of String a and b 
            // notice that left side is an int and right side is char 
            // so we need to minus the decimal value of '0' 
            int p = i < len1 ? a.charAt(len1 - 1 - i) - '0' : 0; 
            int q = i < len2 ? b.charAt(len2 - 1 - i) - '0' : 0; 
            int tmp = p + q + carry; carry = tmp / 2; res = tmp % 2 + res;
        }

        return (carry == 0) ? res : "1" + res;
    }
}
