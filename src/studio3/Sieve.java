package studio3;
import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] num = new int[n];
		for (int i=1; i<n; i++) num[i]=i+1;
		for (int i=1; i<n; i++)
			for (int j=2; j<=Math.pow(num[i],0.5); j++)
				if (num[i]%j==0)
				{
					num[i]=0;
					break;
				}
		for (int i=0; i<n; i++)
			if(num[i] != 0)
				System.out.print(num[i] + " ");

	}

}
