package com.gl.BracketBalance.main;

import com.gl.BracketBalance.impl.BalBrackets;
import com.gl.BracketBalance.impl.BalanceImplementation;
import java.util.Scanner;

public class BalanceMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        
        BalBrackets balancedBrackets = new BalanceImplementation();
        
        if (balancedBrackets.isBalanced(input)) {
            System.out.println("The entered String has Balanced Brackets");
        } else {
            System.out.println("The entered String does not contain Balanced Brackets");
        }
    }
}
