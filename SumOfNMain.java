package FlowControl;

import java.util.Scanner;

public class SumOfNMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumOfN s = new SumOfN();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int number = sc.nextInt();
		s.Sum(number);
		sc.close();

	}

}
