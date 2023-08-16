import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt(); 

        int EvenSum = 0;
        int OddSum = 0;

        while(n>0){
			int num =n%10;
			if(num%2==0){
				EvenSum+=num;
			}else{
				OddSum+=num;
			}
			n=n/10;
		}
		System.out.print(EvenSum+" "+OddSum);
    }
}