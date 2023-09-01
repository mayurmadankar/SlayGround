import java.util.* ;
import java.io.*; 
public class Solution {
  public static int sumOfMaxMin(int[] arr, int n) {
      // Write your code here.
       int max = Integer.MIN_VALUE;
      int min = Integer.MAX_VALUE;

      for (int i = 0; i < n; i++) {
        if (arr[i] > max) {
          max = arr[i];
        }
        
        if (arr[i] < min) {
          min = arr[i];
        }
      }
      return min + max;
  }
}