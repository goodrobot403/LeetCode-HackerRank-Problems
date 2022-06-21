package leetcode;

import java.util.Stack;

/*
https://leetcode.com/problems/backspace-string-compare/
*/
public class BackspaceStringCompare {

    public boolean backspaceCompare(String s, String t) {
        s = removeBackspaceChar(s);
        t = removeBackspaceChar(t);
        return s.equals(t);
    }

    public String removeBackspaceChar(String input) {

        char[] inputCharacters = input.toCharArray();
        Stack<Character> modifiedCharacters = new Stack<>();
        for (char c : inputCharacters) {
            if (c != '#') {
                modifiedCharacters.push(c);
            } else if (!modifiedCharacters.empty()) {
                modifiedCharacters.pop();
            }
        }
        return String.valueOf(modifiedCharacters);
    }
}