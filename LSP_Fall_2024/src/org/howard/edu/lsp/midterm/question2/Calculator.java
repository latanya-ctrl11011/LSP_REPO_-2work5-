package org.howard.edu.lsp.midterm.question2;

/**
 * A utility class providing static methods for calculating sums of different data types.
 */

//utilized chatgpt to help create javadocs for clear documentation
public class Calculator {

    /**
     * Calculates the sum of two integers.
     *
     * @param a the first integer
     * @param b the second integer
     * @return the sum of the two integers   

     */
    public static int sum(int a, int b) {
        return a + b;
    }

    /**
     * Calculates the sum of two double values.
     *
     * @param a the first double value
     * @param b the second double value
     * @return the sum of the two double values
     */
    public static double sum(double a, double b) {
        return a + b;
    }

    /**
     * Calculates the sum of all elements in an integer array.
     *
     * @param arr the integer array
     * @return the sum of all elements in the array
     */
    public static int sum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
}
