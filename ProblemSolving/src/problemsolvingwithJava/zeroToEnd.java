package problemsolvingwithJava;

import java.util.Arrays;
import java.util.Collections;


public class zeroToEnd {
	
	public void main( String[] args )
	{
		 int arr[] ={ 1,2,0,1,0,4,0};
	     zerosToEnd(arr);
	     System.out.println(Arrays.toString(arr));
	}
	
	public static void zerosToEnd( int[] arr )
	{
		int n = arr.length;
		
		int k = 0;
		
		while ( k < n )
		{
			if (arr[k] == 0)
				break;
			else
				k++;
		}
		
		int i = k, j = k + 1;
		
		while ( i < n && j < n )
		{
			if (arr[i] != 0) {
	            Collections.swap(Arrays.asList(arr), i, j);
	            i++;
	        }
	        j++;
		}
	}
}
