package DataStructure;

import java.util.*;


public class LongestSubArraySum {
	
	public static int getLongestSubarray(int []a, int k )
	{
		int n = a.length;
		
		Map<Integer, Integer> preSumMap = new HashMap<>();
		
		int sum =  0;
		int maxlen= 0;
		
		for ( int i = 0; i < n; i++ )
		{
			sum += a[i];
			
			if ( sum == k )
				maxlen = Math.max(maxlen, i + 1);
			
			int rem = sum - k;
			
			if ( preSumMap.containsKey(rem))
			{
				int len = i - preSumMap.get(rem);
				maxlen = Math.max(maxlen, len);
			}
			
			if ( !preSumMap.containsKey(sum) )
			{
				preSumMap.put( sum,  i);
			}
				
		}
		
		return maxlen;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = { -1, 1, 1};
        int k = 1;
        int len = getLongestSubarray(a, k);
        System.out.println("The length of the longest subarray is: " + len);
		
	}

}
