class Solution {
    public int maxVowels(String s, int k) {
        int start = 0;
        int end = 0;
        int len = s.length();
        int count = 0;
        int ans = 0;

       
        while (end < len) {
            
            if (isVowel(s.charAt(end))) {
                count++;
            }

            
            if (end - start + 1 > k) {
                if (isVowel(s.charAt(start))) {
                    count--;
                }
                start++;
            }

            if (end - start + 1 == k) {
                ans = Math.max(ans, count);
            }
            end++;
        }

        return ans;
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
