import java.util.ArrayList;

public class Solution {

    public static int findDuplicate(ArrayList<Integer> arr) {

        int N = arr.size();
        int dup = -1; // Initialize dup to a default value

        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                if (arr.get(i).equals(arr.get(j))) {
                    dup = arr.get(i);
                    break; // No need to continue searching if duplicate is found
                }
            }
            if (dup != -1) {
                break; // No need to continue searching if duplicate is found
            }
        }

        return dup;
    }
}
