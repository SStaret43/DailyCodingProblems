//Using Java
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
