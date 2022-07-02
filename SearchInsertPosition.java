public class SearchInsertPosition {

    public static int searchInsert(int[] nums, int target) {
        int first_pointer = 0;
        int last_pointer = nums.length - 1;
        while (first_pointer <= last_pointer) {
            int index = (last_pointer + first_pointer) / 2;
            if (nums[index] == target) {
                return index;
            } else if (nums[index] > target) {
                last_pointer = index - 1;
            } else {
                first_pointer = index + 1;
            }
        }

        return last_pointer;
    }

    public static void main(String[] args) {
        System.out.println(searchInsert(new int[] { 1, 3, 5, 6 }, 2));
    }
}
