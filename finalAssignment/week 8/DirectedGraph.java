package Week8;

import java.util.LinkedList;

public class DirectedGraph {

	        int VOG; 
	        LinkedList<Integer> adjacencyListArray[]; 
	        
	          
	        
	        DirectedGraph(int VertexOfGraph) 
	        { 
	            this.VOG = VertexOfGraph; 
	            adjacencyListArray = new LinkedList[VertexOfGraph];
	            for(int i = 0; i < VertexOfGraph ; i++){ 
	                adjacencyListArray[i] = new LinkedList<>(); 
	            } 
	        } 
	
	        public static void main(String args[]) 
		    { 
		        int VertexOfGraph = 5; 
		        DirectedGraph DirGraph = new DirectedGraph(VertexOfGraph); 
		        adEd(DirGraph, 0, 1); 
		        adEd(DirGraph, 0, 2);
		        adEd(DirGraph, 0, 3);
		        adEd(DirGraph, 0, 4);
		        adEd(DirGraph, 1, 2); 
		        adEd(DirGraph, 1, 3); 
		        adEd(DirGraph, 1, 4); 
		        adEd(DirGraph, 2, 3); 
		        adEd(DirGraph, 3, 4); 
		        printDirectedGraph(DirGraph); 
		    } 

	    static void adEd(DirectedGraph DirectedGraph, int src, int dest) /**adEd=AddEdge**/
	    { 
	      
	        DirectedGraph.adjacencyListArray[src].add(dest); 
	     
	    } 
	       
	    
	    static void printDirectedGraph(DirectedGraph DirectedGraph) 
	    {        
	        for(int VertexOfGraph = 0; VertexOfGraph < DirectedGraph.VOG; VertexOfGraph++) 
	        { 
	            System.out.println("Vertex Number"+ VertexOfGraph); 
	            System.out.print("value"); 
	            for(Integer Values: DirectedGraph.adjacencyListArray[VertexOfGraph]){ 
	                System.out.print(" -> "+Values); 
	            } 
	            System.out.println("\n"); 
	        } 
	    } 
	       
	   
	}

