package FlowControl;

import java.util.Scanner;

public class TrafficLightMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TrafficLights tl = new TrafficLights();
		Scanner sc = new Scanner(System.in);
		System.out.println("Press 1 for Red Light");
		System.out.println("Press 2 for Yellow Light");
		System.out.println("Press 3 for Green Light");
		int number = sc.nextInt();
		tl.Message(number);
		sc.close();
				
	}

}
