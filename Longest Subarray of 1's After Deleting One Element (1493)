class Solution {
    public int longestSubarray(int[] nums) {
        int start = 0;
        int czero = 0;
        int ans = 0;

        for (int end = 0; end < nums.length; end++) {
            if (nums[end] == 0) {
                czero++;
            }

            while (czero > 1) {
                if (nums[start] == 0) {
                    czero--;
                }
                start++;
            }

            ans = Math.max(ans, end - start);
        }

        return ans;
    }
}
