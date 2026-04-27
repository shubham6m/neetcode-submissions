class Solution {
    public boolean isAnagram(String s, String t) {
        /*we can took one array of size 26 & for the first string 
        increase the count of per character respective index 
        & for second string decreaase the count & In last 
        if I traverse array, all should be zero for a valid anagram */
        int count[] = new int[26];
        if(s.length()!=t.length()){
            return false;
        }
        for(int i = 0; i<s.length(); i++){
            count[s.charAt(i)-'a']++;
            count[t.charAt(i)-'a']--;
        }
        for(int i = 0; i<count.length; i++){
            if(count[i]!=0){
                return false;
            }
        }
        return true;
    }
}
