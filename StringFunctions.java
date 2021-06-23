package Strings;

public class StringFunctions {

	
	public void Length(String name)
	{
		int len=0;
		char []ch = name.toCharArray();
		
		for(char names : ch)
		{
			len++;
		}
		System.out.println("The length os the String is "+len);
	}
	public void charAt(char ch,String name)
	{
		int count=0;
		char[] array = name.toCharArray();
		
		for(int i=0;i<array.length;i++)
		{
			if(ch==array[i])
				break;
			count++;
		}
		
		System.out.println("The character is at "+count+1);
	}
}
