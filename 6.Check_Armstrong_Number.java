//time complexity - O(log(n))
//space complexity -O(1)

import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();

		int original =n;
		int temp=n;
		int sum=0;
		int count=0;
		int number;

		while(temp!=0){
			count++;
			temp=temp/10;
		}
		while(n!=0){
		   number = n%10;
			sum+=Math.pow(number , count);
			n=n/10;
		}
		boolean isArmstrong = original==sum;

		if(isArmstrong){
			System.out.print("true");
		}else{
			System.out.print("false");
		}
	}
}

 