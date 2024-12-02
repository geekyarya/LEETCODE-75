class Solution {
    public int equalPairs(int[][] grid) {
    
        HashMap<List<Integer>,Integer> mp=new HashMap<>();
        int count=0;

        for(int r=0;r<grid.length;r++){
            List<Integer> ls=new LinkedList<>();
            for(int c=0;c<grid[0].length;c++){            
                ls.add(grid[r][c]);
            }
            if(!mp.containsKey(ls))
            {
                mp.put(ls,0);
            }
            mp.put(ls, mp.getOrDefault(ls, 0)+1);
                
        }

        for(int c=0;c<grid.length;c++){
            List<Integer> ls=new LinkedList<>();
            for(int r=0;r<grid[0].length;r++){            
                ls.add(grid[r][c]);
            }
            if(mp.containsKey(ls))
            count+=mp.get(ls);
        }
        return count;
    }
}