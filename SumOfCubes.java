package FlowControl;

public class SumOfCubes {

	public int calculate(int number)
	{
		int sum=0;
		while(number>=1)
		{
			int n = number%10;
			int cube = n*n*n;
			sum= sum+cube;
			number = number/10;
		}
		return sum;
	}
}
