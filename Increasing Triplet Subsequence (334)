class Solution {
    public boolean increasingTriplet(int[] nums) {
        int num1=Integer.MAX_VALUE;
        int num2=Integer.MAX_VALUE;
        int num3=nums[0];
        for(int i=0;i<nums.length;i++){
            num3=nums[i];
            if(num1>=num3){
                num1=num3;
            }else if(num2>=num3){
                num2=num3;
            }else{
                return true;
            }
        }
        return false;
    }
}
