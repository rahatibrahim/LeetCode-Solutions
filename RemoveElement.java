public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        int lp = nums.length - 1;

        for (int i = 0; i <= lp; i++) {
            if (nums[i] == val) {
                while (lp >= 0 && nums[lp] == val) {
                    nums[lp] = -1;
                    k++;
                    lp -= 1;
                }
                if (lp < 0 || lp < i) {
                    return nums.length - k;
                }
                nums[i] = nums[lp];
                nums[lp] = -1;
                k++;
                lp -= 1;
            }
        }
        return nums.length - k;
    }

    public static void main(String[] args) {
        RemoveElement e = new RemoveElement();
        int[] a = {4};
        System.out.println(e.removeElement(a, 4));
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}
