package hashing;

import java.util.HashMap;
import java.util.Map;

public class SecondMostFrequentElement {
	
	
	public static int secondMostFrequentElement(int[] nums) {
        int n = nums.length;
        int maxF = 0;
        int maxSecF = 0;
        int maxEl = -1;
        int sMaxEl = -1;
        Map<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i<n; i++){
               map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }

        for(Map.Entry<Integer,Integer> it : map.entrySet()){
           int ele = it.getKey();
           int max = it.getValue();

           if(max>maxF){
            maxSecF = maxF;
            maxF  = max;
            sMaxEl = maxEl;
            maxEl =ele;
           }else if(max == maxF){
              maxEl = Math.min(maxEl,ele);
           }else if(max>maxSecF){
             maxSecF = max;
             sMaxEl = ele;
           }else if(max == maxSecF){
             sMaxEl = Math.min(sMaxEl,ele);
           }

        }
      return sMaxEl;
     
    }


	public static void main(String[] args) {
		int nums[] = {1, 2, 2, 3, 3, 3};
		int ans= secondMostFrequentElement(nums);
           System.out.println(ans);

	}

}
