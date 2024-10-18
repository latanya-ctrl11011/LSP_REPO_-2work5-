package org.howard.edu.lsp.midterm.question2;

/**
 * A driver class to show the Calculator class being used
 */
public class CalculatorDriver {
    public static void main(String[] args) {
        System.out.println(Calculator.sum(5, 10));
        System.out.println(Calculator.sum(3.5, 7.8));
        System.out.println(Calculator.sum(new int[]{1, 2, 3, 4, 5}));
    }
}
