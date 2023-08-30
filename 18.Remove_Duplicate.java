import java.util.ArrayList;
public class Solution {
    public static int removeDuplicates(ArrayList<Integer> arr, int n) {
        // Write your code here.
        int i = 1;
        while (i < n) {
            int a = arr.get(i - 1);
            int b = arr.get(i);

            if (a == b) {
                arr.remove(i);
                n--;
            } else {
                i++; // Move to the next index only if no removal was done
            }
        }
        return arr.size();
    }
}
