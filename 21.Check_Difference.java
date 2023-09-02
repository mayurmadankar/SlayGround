import java.util.* ;
import java.io.*; 
public class Solution 
{
	public static boolean checkDiff(int[] arr, int N, int K) 
    {
		// WRITE YOUR CODE HERE
		HashSet<Integer> set= new HashSet<>();

		for(int num : arr){
			if(set.contains(num-K) || set.contains(num+K)){
				return true;
			}
			set.add(num);
		}
		return false;
	}
}