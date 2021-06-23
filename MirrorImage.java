package Strings;
public class MirrorImage {
	public void mirror(StringBuffer string)
	{
		StringBuffer s2 = new StringBuffer(string);
		s2.reverse();
		/*for(      i=string.length()-1;i>=0;i--)
		{
		s = string.charAt(i);
		s1 = s1+s;
		*/
		System.out.println(string +" ||"+s2);
	}
}