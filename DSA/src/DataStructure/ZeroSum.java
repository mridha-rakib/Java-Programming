package DataStructure;

import java.util.*;
import java.lang.*;
import java.io.*;

public class ZeroSum {
	
	public static boolean findsum(int arr[],int n)
	{
		HashSet<Integer> prefixSums = new HashSet<>();
		int sum = 0;
		
		for ( int i = 0; i < n; i++ )
		{
			sum += arr[i];
			
			if ( arr[i] == 0 || sum == 0 || prefixSums.contains(sum))
			{
				return true;
			}
		}
		
		return false;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner( System.in );
		
		int t = sc.nextInt();
		
		while ( t-->0 )
		{
			int n = sc.nextInt();
			
			int arr[] = new int[n];
			
			for ( int i = 0; i < n; i++ )
			{
				arr[i] = sc.nextInt();
			}
			
			System.out.println(findsum(arr, n) == true? "Yes":"No");
		}

	}
	
	
}
