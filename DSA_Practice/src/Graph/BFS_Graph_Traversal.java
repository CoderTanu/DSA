package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

//breadth first search--level wise traversal
public class BFS_Graph_Traversal {
	
	
	
	
	public ArrayList<Integer> bfsOfGraph(int v, ArrayList<ArrayList<Integer>> adj){
		
		ArrayList<Integer> bfs = new ArrayList<Integer>();
		boolean vis[] = new boolean[v];
		Queue<Integer> queue = new LinkedList<>();
		
		queue.add(0);
		vis[0] = true;
		
		while(!queue.isEmpty()) {
			Integer node  = queue.poll();
			bfs.add(node);
			
			//get all adjacent vertices of the dequeued and if a adjacent has not visited then marked visited and enqueue it
		
		   for(Integer it: adj.get(node)) {
			   if(vis[it] == false) {
				   vis[it] = true;
				   queue.add(it);
			   }
		   }
		
		
		}
		
		
		return bfs;
	}
	
	
	
	
	

	public static void main(String[] args) {
		
		bfsOfGraph();
		
		
		
		
		
		
	}

}
