public class Test {
    public static String removeDigit(String number, char digit) {
        String max = "0";
        String curr = "0";
        StringBuilder numArray = new StringBuilder(number);
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == digit) {
                numArray.deleteCharAt(i);
                curr = numArray.toString();
                if(max.compareTo(curr) > 0)
                    max = curr;
                numArray.insert(i, number.charAt(i));
            }
        }
        
        return max;
    }

    public static void main(String[] args) {
        String str = "1231";
        System.out.println(removeDigit(str, '1'));
    }
}
