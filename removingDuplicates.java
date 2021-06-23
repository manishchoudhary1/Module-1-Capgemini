package Arrays;

public class removingDuplicates {

	
	public void remove(int[] arr)
	{
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
					arr[j]=0;
			}	
		}
		System.out.println("The array after removing duplicates is ");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==0)
				continue;
			System.out.print(arr[i]+" ");
		}
	}
}
