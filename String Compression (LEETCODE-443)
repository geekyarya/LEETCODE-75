class Solution {
    public int compress(char[] chars) {
        int i = 0, k = 0;

        while (i < chars.length) {
            char currentChar = chars[i];
            int c = 0;

            while (i < chars.length && chars[i] == currentChar) {
                i++;
                c++;
            }

            chars[k++] = currentChar;

            if (c > 1) {
                for (char digit : Integer.toString(c).toCharArray()) {
                    chars[k++] = digit;
                }
            }
        }

        return k;
    }
}
