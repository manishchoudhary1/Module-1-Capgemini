package FlowControl;

import java.util.Scanner;

public class PowerOfTwoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		PowerOfTwo p = new PowerOfTwo();
		System.out.println("enter the number");
		int number = sc.nextInt();
		System.out.println(p.naive(number));
		sc.close();

	}

}
