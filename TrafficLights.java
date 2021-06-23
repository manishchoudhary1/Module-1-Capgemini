package FlowControl;

public class TrafficLights {

	public void Message(int number)
	{
		if(number == 1)
			System.out.println("Stop");
		else if(number==2)
			System.out.println("Wait");
		else if(number==3)
			System.out.println("Go");
		else
			System.out.println("Invalid Input");
	}
}
