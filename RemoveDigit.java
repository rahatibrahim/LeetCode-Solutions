public class RemoveDigit {
    public static String removeDigit(String number, char digit) {
        String max = "0", curr = "0";
        StringBuilder numArray = new StringBuilder(number);

        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == digit) {
                numArray.deleteCharAt(i);
                curr = numArray.toString();
                if(curr.compareTo(max) > 0)
                    max = curr;
                numArray.insert(i, number.charAt(i));
            }
        }

        return max;
    }
}
