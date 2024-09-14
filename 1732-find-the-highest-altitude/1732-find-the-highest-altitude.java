class Solution {
    public int largestAltitude(int[] gain) {
        int n=gain.length;
        
        int ans=0;
        int presum=0;
        for(int val:gain){
            presum+=val;
            if(presum>=ans)
            ans=presum;
        }
        return ans;
    }
}