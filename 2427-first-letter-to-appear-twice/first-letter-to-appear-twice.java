class Solution {
    public char repeatedCharacter(String s) {
        int[] arr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            int idx = s.charAt(i) - 'a';
            arr[idx]++;
            if (arr[idx] == 2)
                return s.charAt(i);
        }
        return 'z';
    }
}