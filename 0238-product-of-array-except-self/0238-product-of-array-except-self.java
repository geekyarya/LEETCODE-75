class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] leftp=new int[nums.length];
        int[] rightp=new int[nums.length];
        leftp[0]=1;

        for(int i=1;i<nums.length;i++)
        {
            leftp[i]=leftp[i-1]*nums[i-1];
        }

        rightp[nums.length-1]=1;
        for(int i=nums.length-2;i>-1;i--)
        {
            rightp[i]=rightp[i+1]*nums[i+1];
        }
        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i]=leftp[i]*rightp[i];
        }
        return ans;
    }
}