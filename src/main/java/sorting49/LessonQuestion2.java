package sorting49;

import java.util.Arrays;

/*
 *Find the count of no of nobel integer in an array. a[i] is the noble integer if count of elements smaller than a[i]  == a[i] 
 */
public class LessonQuestion2 {
	
	
	//Bruteforce 
	
	
	public int countNobleInteger(int arr[]) {
		
		int n = arr.length;
		int ans =0;
		for(int i =0; i < n; i++) {
			int count =0;
			for(int j =0; j < n; j++) {
				if(arr[j] < arr[i]) {
					count++;
				}
				
				if(count ==arr[i]) {
					ans++;
				}
				
				//Time complexity = O(n*n)
			}
		}
		return ans;
	}
	
		//Optimise 
	public int countNobleInteger2(int arr[]) {
		Arrays.sort(arr);//SORTED in ascending order
		
		int n = arr.length;
		int ans=0;
		for(int i =0; i < n; i++) {
			if(arr[i] == i) {
				ans++;
			}
		} // TC- O(n)
		
		return ans;
	}
	
	

	
	public static void main(String[] args) {
		
	}

}