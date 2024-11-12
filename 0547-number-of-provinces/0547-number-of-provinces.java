class Solution {
    public int findCircleNum(int[][] isConnected) {
        int ans=0,n=isConnected.length;
        boolean vis[]=new boolean[n];
        for(int i=0;i<n;i++)
        {
            if(!vis[i])
            {
                ans++;
                dfs(i,vis,isConnected);
            }
        }
        return ans;
    }
    public void dfs(int i,boolean[] vis,int[][] isConnected)
    {
        vis[i]=true;
        for(int j=0;j<isConnected.length;j++){
            if(!vis[j] && isConnected[i][j]==1)
            dfs(j,vis,isConnected);
        }
    }
}