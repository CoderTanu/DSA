package Graph;

import java.util.ArrayList;

public class GraphImpInJava {

	
	public static void main(String[] args) {
		int n = 3; int m =3;
		
		int adj[][] = new int[n][m];
		
		
		
		
		//adj list
		
		ArrayList<ArrayList<Integer>> adjList = new ArrayList<ArrayList<Integer>>();
		
		for(int i=0; i<=n; i++) {
			adjList.add(new ArrayList<Integer>());
		}
			
			//edge 1----2
			adjList.get(1).add(2);
			adjList.get(2).add(1);
			
			
			//edge 2----3
			adjList.get(2).add(3);
			adjList.get(3).add(2);
			
			
			//edge 1----3
			adjList.get(1).add(3);
			adjList.get(3).add(1);
			
			
			
			
		
		
		for(int i=1; i<n; i++) {
            for(int j=0; j<adjList.get(i).size(); j++) {
            	System.out.println(adjList.get(i).get(j) + " ");
				
			}
            System.out.println();
		}
		
	}
	
}
