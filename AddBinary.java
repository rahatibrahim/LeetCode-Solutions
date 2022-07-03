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


    public static void main(String[] args) {
        System.out.println(addBinary("10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101","101"));
        //"10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101"
        //"110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011"
        
    }
}
