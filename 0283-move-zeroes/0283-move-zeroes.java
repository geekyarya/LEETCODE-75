class Solution {
    public void moveZeroes(int[] nums) {
        int i,j=0,t;
        for(i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                t=nums[i];
                nums[i]=nums[j];
                nums[j]=t;
                j++;
            }
        }
       for(i=0;i<nums.length;i++)
        {
            System.out.print(nums[i]);
        }
    }
}