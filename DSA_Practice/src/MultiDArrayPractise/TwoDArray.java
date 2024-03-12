package MultiDArrayPractise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TwoDArray {

	public static void main(String[] args) {

//Way to declare the 2d array is
		//1. assigning value to 2d array
//		int m[][] = new int [2][2];
//		int m[][]= {{2,4},{3,2}};
//		m[0][0] = 2;
//		m[0][1] = 4;
//		m[1][1] = 6;
//		m[1][0] = 8;
//		
//		for(int i=0; i<m.length; i++) {
//			for(int j=0; j< m[i].length; j++) {
//				System.out.print(m[i][j] + " ");
//			}
//			System.out.println();
//		}
    	int m[][]= {{2,4},{3,2}};
		int n[][]= {{1,1},{1,1}};
		int x=3;
		int count=0;
		 List<Integer> list = new ArrayList<Integer>();
			for(int i=0; i<m.length; i++) {
				for(int j=0; j<m[i].length; j++) {
					list.add(m[i][j]);
					System.out.println("list "+list);
				  }
				}
			
			for(int i=0; i<n.length; i++) {
				for(int j=0; j<n[i].length; j++) {
					int a =n[i][j];
					System.out.println("a "+a);
					int b=x-a;
					System.out.println("b "+b);
					if(list.contains(b)){
						count++;
						System.out.println("count "+count);
					}
					
				  }
				}
			
			
			Set<Integer> set = new HashSet<Integer>();
			 Map<String, Integer> map = new HashMap<String, Integer>(); 
			
			 
			
//		int x=3;
//		int count=0;
//		System.out.println(m.length);
//		System.out.println(n.length);
//		
//		for(int i=0; i<m.length; i++) {
//			for(int j=0; j<m[i].length; j++) {
//				int a =m[i][j];
//				int b=x-a;
				
				
				
				
				
				
				
//				for(int k=0; k<n.length; k++) {
//					for(int l=0; l<n[i].length; l++) {
//						if(n[k][l] == b) {
//							count++;
//							System.out.println(count);
//						}else if(n[k][l] > b) {
//							break;
//						}
//					}
			}
			
//		
//			}
//		}
//		
//	}

}
