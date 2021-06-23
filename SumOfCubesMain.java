package FlowControl;

import java.util.Scanner;

public class SumOfCubesMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number ");
		int number = sc.nextInt();
		SumOfCubes s = new SumOfCubes();
		int result = s.calculate(number);
		System.out.println("Result is "+result);
		sc.close();
	}

}
