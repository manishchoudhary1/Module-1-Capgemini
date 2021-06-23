package Strings;

public class SumOfIntegers {

	
	public void sum(String s)
	{
		char SubString;
		int sum=0;
		System.out.println("The Characters in the String are");
		for(int i=0;i<s.length();i++)
		{
			SubString = s.charAt(i);
			System.out.print(SubString+" ");
			int x = Character.getNumericValue(SubString);
			sum = sum+x;
		}
		System.out.println("The Sum is "+sum);
	}
}
