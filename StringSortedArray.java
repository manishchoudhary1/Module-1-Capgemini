package Arrays;

import java.util.Arrays;

public class StringSortedArray {

	public String sortString(String string)
	{
		String firstHalf="";
		String secondHalf="";
		char []ch = string.toCharArray();
		
		
		for(int i=0;i<ch.length/2;i++)
			firstHalf=firstHalf+ch[i];
		
		for(int i=ch.length/2;i<ch.length;i++)
			secondHalf = secondHalf+ch[i];
		
		firstHalf = firstHalf.toUpperCase();
		secondHalf = secondHalf.toLowerCase();
		
		return firstHalf+secondHalf;
	}
}
