/*Using Java
The Problem:
This problem was asked by Uber.
Given an array of integers, return a new array such that each element at index i of the new array is
the product of all the numbers in the original array except the one at i. Solve it without using division and in O(n) time.
For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would be [2, 3, 6].
*/
package problem2;

public class Problem2 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        problem2(array);
    }

    public static void problem2(int[] n) {
        int[] leftSide = new int[n.length];
        int[] rightSide = new int[n.length];
        int[] finalArray = new int[n.length];

        leftSide[0] = 1;
        rightSide[n.length - 1] = 1;

        //left array
        for (int i = 1; i < n.length; i++)
            leftSide[i] = leftSide[i - 1] * n[i - 1];

        //right array
        for (int i = n.length - 2; i >= 0; i--)
            rightSide[i] = rightSide[i + 1] * n[i + 1];

        //final array that is a product of the left and right arrays
        for (int i = 0; i < n.length; i++)
            finalArray[i] = leftSide[i] * rightSide[i];

        //printing final array
        for (int i = 0; i < n.length; i++)
            System.out.println(finalArray[i]);
    }
}
