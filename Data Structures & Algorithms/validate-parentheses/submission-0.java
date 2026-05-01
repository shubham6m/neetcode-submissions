class Solution {
    public boolean isValid(String s) {
        //create stack to store the parenthesis
        Stack<Character> st = new Stack();
        for(int i =0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(isPair(ch)){
                st.push(ch);
            }
            else if(!st.isEmpty() && ch == ')' && st.peek() == '('){
                st.pop();
            }else if(!st.isEmpty() && ch == ']' && st.peek() == '['){
                st.pop();
            }
            else if(!st.isEmpty() && ch == '}' && st.peek() == '{'){
                st.pop();
            }else{
                return false;
            }
        }
        return st.isEmpty();
    }
    private boolean isPair(char ch){
        if(ch == '[' || ch == '(' || ch == '{'){
            return true;
        }
        return false;
    }
}
