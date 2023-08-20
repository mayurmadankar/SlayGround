import java.util.* ;
import java.io.*; 
public class Solution {
	public static int[] termsOfAP(int x){
		// Write your code here.
		int no=1;
		int count =0;
		int res;
		int i=0;
		int arr[] = new int[x];

		while(count<x){
			res=3*no+2;
			if(res%4!=0){
				arr[i]=res;
				i++;
				count++;
			}
			no++;
		}
		return arr;
	}
}
