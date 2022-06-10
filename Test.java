public class Test {
    public static void main(String[] args) {
        int[] a = new int[] {1, 2, 3, 5, 6, 7};
        int[] b = new int[] {-1, -2, -3,};
        System.out.println("1st: " + a.length);
        a = b.clone();
        System.out.println("after: " + a.length);
        b[0] = 0;
        for (int i : a) {
            System.out.println(i);
        }
    }
}
