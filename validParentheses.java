public class Solution {
    public boolean isValid(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(s.length() == 0)
            return true;
        if(s.length() % 2 != 0)
            return false;
        char[] brackets = s.toCharArray();
        Stack<Character> stack = new Stack<Character>();
        for(int i = 0; i < brackets.length; i++) {
            if(brackets[i] == '(' || brackets[i] == '[' || brackets[i] == '{')
                stack.push(brackets[i]);
            else if(brackets[i] == ')' || brackets[i] == ']' || brackets[i] == '}') {
                if(stack.isEmpty())
                    return false;
                char c = stack.pop();
                if(brackets[i] == ')' && c != '(')
                    return false;
                if(brackets[i] == ']' && c != '[')
                    return false;
                if(brackets[i] == '}' && c != '{')
                    return false;
            }
            else
                return false;
        }
        if(!stack.isEmpty())
            return false;
        else 
            return true;
    }
}