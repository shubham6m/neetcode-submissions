class Solution {
    public boolean isPalindrome(String s) {
            //convert to lower ce & remove all extra spaces & charcter other than alphanumeric
            String ss = s.toLowerCase().replaceAll("\\s","").replaceAll("[^A-Za-z0-9]","");
            int i = 0, j = ss.length()-1;
            while(i<j){
                if(ss.charAt(i++)!=ss.charAt(j--)){
                    return false;
                }
            }
        return true;
        }
    }
