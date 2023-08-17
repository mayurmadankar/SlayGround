//time complexity -O(1)
//space complexity - O(1)

public class Solution {
    public static int sumFirstN(int n) {
        // Write Your Code Here
       
        int res =0;

        for(int i=1 ;i<=n ;i++){
            res+=i;
        }
        return res;
    }
}