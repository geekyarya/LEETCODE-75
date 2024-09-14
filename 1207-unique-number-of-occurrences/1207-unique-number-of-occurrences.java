class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        
        List<Integer> list=new ArrayList<>(map.values());
        Collections.sort(list);
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i).equals(list.get(i+1)))
            return false;
        }
        return true;
    }
}