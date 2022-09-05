public class Test {
    public static String encode(String s) {
        if (s == null || s.length() == 0) return "";

        String res = "";
        char c = s.charAt(0);
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                count++;
            } else {
                res += count + "" + c;
                c = s.charAt(i);
                count = 1;
            }
        }

        res += count + "" + c;
        return res;
    }

    public static void main(String[] args) {
        System.out.println(encode("aacvvedd"));
    }
}