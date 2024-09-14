class Solution {
    public String reverseVowels(String s) {
        int i;
        char arr[]=s.toCharArray();
        HashSet<Character> vowels = new HashSet<Character>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');
        Stack<Character> stack = new Stack<>();
        for(char ch:arr)
        {
            if(vowels.contains(ch))
            stack.push(ch);
        }
        for(i=0;i<arr.length;i++)
        {
            if(vowels.contains(arr[i]))
            {
                arr[i]=stack.pop();
            }
        }
        return new String(arr);
    }
}
