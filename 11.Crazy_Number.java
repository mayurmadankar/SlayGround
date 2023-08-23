import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

	public static ArrayList<ArrayList<Integer>> numberPattern(int n) {
        int num = 1;
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        for (int i = n - 1; i >= 0; i--) {
            ArrayList<Integer> temp = new ArrayList<>();

            for (int j = 0; j < n; j++) {
                if (j < i)
                    temp.add(-1);
                else {
                    temp.add(num++);
                    if (num == 10)
                        num = 1;
                }
            }

            ans.add(temp);
        }

        return ans;
	}
}