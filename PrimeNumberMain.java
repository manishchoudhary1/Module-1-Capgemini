package FlowControl;

import java.util.Scanner;

public class PrimeNumberMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		PrimeNumbers pm = new PrimeNumbers();
		System.out.println("Enter number");
		boolean print ;
		int number = sc.nextInt();
		for(int i=0;i<=number;i++)
		{
			print =pm.isPrime(i);
			if(print)
			{
				System.out.println(i);
			}
		}
		
		sc.close();
	}
	

}
