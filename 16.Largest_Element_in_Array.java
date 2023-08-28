import java.util.* ;
import java.io.*; 

public class Solution {

    static int largestElement(int[] arr, int n) {
        // Write your code here.
        int largest = Integer.MIN_VALUE;
        int slargest = -1;
        for(int i=0 ; i<n; i++){
            if(arr[i]>largest){
                slargest = largest;
                largest=arr[i];
            }else if(arr[i]<largest && arr[i]>slargest){
                slargest = arr[i];
            }
        }
        return largest;
    }
}