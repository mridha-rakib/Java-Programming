package problemsolvingwithJava;

public class ZeroMoveToLastIndex {
	
	public static void main( String[] args)
	{
		 int arr[] ={ 1,2,0,1,0,4,0};
	      zerosToEnd(arr);
	}
	
	public static void zerosToEnd( int[] arr )
	{
		int n = arr.length;
		
		int tmp[] = new int[n];
		
		int k = 0;
		for ( int i = 0; i < n; i++ )
		{
			if ( arr[i] != 0 )
			{
				tmp[k] = arr[i];
				k++;
			}
		}
		
		while ( k < n )
		{
			tmp[k] = 0;
			k++;
		}
		
		for ( int i = 0; i < n; i++ )
		{
			System.out.print(tmp[i]+ " ");
		}
	}

}
