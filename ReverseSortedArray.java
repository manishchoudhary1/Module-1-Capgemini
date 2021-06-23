package Arrays;
import java.util.Arrays;
public class ReverseSortedArray {

	public void ReverseSort(int[] num) {
		// TODO Auto-generated constructor stub
		int len = num.length;
		int[] n = new int[len]; 
		String str = "";
		
		for(int j=0; j<len; j++) {
			str = "";
			str = str + num[j];
			StringBuffer str1 = new StringBuffer(str);
			str1.reverse();
			str = str1 + "";
			n[j] = Integer.parseInt(str);
		}
		Arrays.sort(n);
		System.out.println("Reverse Sorted Integer Array: " + Arrays.toString(n));
	}

}

