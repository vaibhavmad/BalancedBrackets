package com.gl.BracketBalance.impl;

import java.util.*;

public class BalanceImplementation implements BalBrackets {
    
    private boolean checkBalanced(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else {
                return false;
            }
        }
        
        return stack.isEmpty();
    }
    
    @Override
    public boolean isBalanced(String s) {
        return checkBalanced(s);
    }
}
