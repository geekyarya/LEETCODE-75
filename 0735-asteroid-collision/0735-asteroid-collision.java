class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack=new Stack<>();
        for(int val:asteroids){
            while(!stack.isEmpty() && val<0 && stack.peek()>0){
                int sum=val+stack.peek();
                if(sum<0){
                    stack.pop();
                }
                else if(sum>0){
                    val=0;
                }
                if(sum==0){
                    stack.pop();
                    val=0;
                }
            }
            if(val!=0){
                stack.push(val);
            }
        }
        int len=stack.size();
        int[] res=new int[len];
        int i=len-1;
        while(i>=0){
            res[i--]=stack.pop();
        }
        return res;
    }
}