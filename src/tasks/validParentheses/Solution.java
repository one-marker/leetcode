package tasks.validParentheses;

import java.util.Stack;

class Solution {
    Stack<Character> stack = new Stack<>();

    public boolean isValid(String s) {
        char[] chars = s.toCharArray();

        
        for (int i = 0; i < s.length(); i++) {
            if (chars[i] == '(' || chars[i] == '[' || chars[i] == '{') {
                stack.push(chars[i]);
            } else if (chars[i] == ')' || chars[i] == ']' || chars[i] == '}') {
                char closeSym = stack.pop();
                if (!isMirror(chars[i], closeSym)) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isMirror(char sym1, char sym2) {
        if (sym1 == '(' && sym2 == ')')
            return true;
        if (sym1 == '[' && sym2 == ']')
            return true;
        if (sym1 == '{' && sym2 == '}')
            return true;

        return false;
    }
}