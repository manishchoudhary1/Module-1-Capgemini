package FlowControl;

public class SumOfN {

	public void Sum(int number)
	{
		int sum=0;
		for(int i=0;i<=number;i++)
		{
			if(i%3==0||i%5==0)
				sum = sum+i;
		}
		System.out.println("The sum is "+sum);
	}
}
