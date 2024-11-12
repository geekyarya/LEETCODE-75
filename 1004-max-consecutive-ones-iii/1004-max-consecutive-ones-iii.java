class Solution {
    public int longestOnes(int[] nums, int k) {
        int i=0;
        int j=0;
        int noofzeros=0;
        int n=nums.length;
        int ans=Integer.MIN_VALUE;
        while(j<n)
        {
            if(nums[j]==0)
            {
                noofzeros++;
            }
            while(noofzeros>k)
            {
                if(nums[i]==0)
                {
                    noofzeros--;
                }
                i++;
            }

            ans=Math.max(ans,j-i+1);
            j++;
        }
        return ans;
    }
}