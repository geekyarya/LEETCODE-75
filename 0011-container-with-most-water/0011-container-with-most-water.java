class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int min=0,tempans=0,ans=Integer.MIN_VALUE;
        while(left<=right){
            min=Math.min(height[left],height[right]);
            tempans=min*(right-left);
            ans=Math.max(ans,tempans);
            if(height[left]>height[right])
            right--;
            else
            left++;
        }
        return ans;
    }
}