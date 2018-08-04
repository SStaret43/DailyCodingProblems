/*Using Java
The Problem:
Given an array of numbers, return whether any two sums to K.
For example, given [10, 15, 3, 7] and K of 17, return true since 10 + 7 is 17.
*/
package problem1;

public class Main {
    public static void main(String[] args) {
        int[] array = {10, 15, 3, 7};
        int k = 17;
        System.out.println(problem1(array, k));
    }
    public static boolean problem1(int[] n, int k) {
        for(int i = 0; i < n.length - 1; i++) {
            for(int j = i + 1; j < n.length; j++) {
                if((n[j] + n[i]) == k)
                    return true;
            }
        }
        return false;
    }
}
