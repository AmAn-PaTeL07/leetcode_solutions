class Solution {
    public int singleNumber(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int c=0;
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] == nums[j]) {
                    c=1;
                    break;
                }
            }
            if (c==0) {
                return nums[i];
            }
            i++;
        }
        return -1;
    }
}