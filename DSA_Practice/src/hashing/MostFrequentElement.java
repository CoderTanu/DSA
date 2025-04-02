package hashing;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentElement {
	
//	 public static int mostFrequentElement(int[] nums) {
//
//	        int n = nums.length;
//	        boolean visit[] = new boolean[n];
//	        int maxFreq = 0;
//	        int maxEle = 0;
//	        for(int i=0; i<n; i++){
//	          if(visit[i]) continue;
//	          int freq = 0;
//	          
//	          for(int j=i; j<n; j++) {
//	        	  if(nums[i]==nums[j]) {
//	        		  freq++;
//	        		  visit[i] = true;
//	        	  }
//	          }
//	          
//	          if(freq>maxFreq) {
//	        	  maxFreq  = freq;
//	        	  maxEle = nums[i];
//	          }else if(freq == maxFreq){
//	        	  maxEle = Math.min(maxEle, nums[i]);
//	          }
//	        	  
//	          }
//	        return maxEle;
//	 }
	 
	 
	 
	 //optimal 
	public static int mostFrequentElement(int[] nums) {

        int n = nums.length;
        int maxFreq = 0;
        int maxEle = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
        	map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        
        
        for(Map.Entry<Integer, Integer> mapData : map.entrySet()) {
        	int el  = mapData.getKey();
        	int freq = mapData.getValue();
        	if(freq>maxFreq) {
        		maxFreq = freq;
        		maxEle =el;
        	}else if(freq == maxFreq) {
        		maxEle = Math.min(maxFreq, el);
        	}
        	
        }
        return maxEle;
 }
	 
	 
	 
	 
	 
	public static void main(String[] args) {
		int nums[] = {1, 2, 2, 3, 3, 3};
		int ans= mostFrequentElement(nums);
           System.out.println(ans);
	}

}
