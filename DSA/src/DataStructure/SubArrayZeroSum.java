package DataStructure;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map


public class SubArrayZeroSum {

	private static<K, V> void insert(Map<K, 
			List<V>> hashMap, K key, V value){
		hashMap.putIfAbsent(key, new ArrayList<>());
		hashMap.get(key).add(value);
	}
	
	public static void printAllSubarrays(int nums[] )
	{
		Map<Integer, List<Integer>> hashMap = new HashMap<>();
		insert(hashMap, 0, -1);
		
		int sum = 0;
		
		for ( int i = 0; i < nums.length; i++ )
		{
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = { 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 };
		 
        printAllSubarrays(nums);

	}

}
