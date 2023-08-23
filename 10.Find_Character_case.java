import java.util.* ;
import java.io.*; 
public class Solution {
    public static int findCase(char ch) {
        // Write your code here.
        if(ch >='A' && ch<='Z'){
            return 1;
        }else if(ch>='a'&&ch<='z'){
            return 0;
        }else{
            return -1;
        }
    }
}
