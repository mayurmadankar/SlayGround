public class Solution {
    public static int[] printNos(int x) {
        // Write Your Code Here
        int result[] = new int[x];    

        while (x > 0) {
            result[x - 1] = x; // Fill the array from the back side at the index x-1
            x--; // Decrement x to move towards the next value
        }    

        return result; 
    }
}