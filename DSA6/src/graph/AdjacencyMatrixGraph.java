package graph;
public class AdjacencyMatrixGraph implements AdjacencyMatrixInterface{
	public int vertices;
	public NodeDetail adjacencyMatrix[][];
	int stack[] = new int[20], top, count, total, total1, minimum = Integer.MAX_VALUE;
	
	public AdjacencyMatrixGraph(int vertices) {
		this.vertices = vertices;
		adjacencyMatrix = new NodeDetail[vertices][vertices];
	}

	/*function to add new edge in graph
	 * */
	public void addEdge(int source, int destination, int weight) {
		NodeDetail node1 = new NodeDetail(1,weight);
		adjacencyMatrix[source][destination] = node1;
		NodeDetail node2 = new NodeDetail(1,weight);
		adjacencyMatrix[destination][source] = node2;
	}
	
	/*function to display graph element
	 * */
	public void display() {
		for (int i=0; i<vertices; i++){
			for (int j=0; j<vertices; j++)
				if (adjacencyMatrix[i][j] == null)
					System.out.print(0 + " ");
				else	
					System.out.print(adjacencyMatrix[i][j].direction + " ");
			System.out.println("\n");
		}
	}
	
	/*function to check whether graph is connect or not
	 * */
	public boolean isConnected(int source) {
		boolean[] visited = new boolean[vertices];
		visited[source] = true;
		push(source);
		while (top != 0){
			int value = pop();
			for (int i=0; i<vertices; i++)
				if (adjacencyMatrix[value][i] != null && visited[i] == false){
					push(i);
					visited[i] = true;
				}
		}
		for (boolean x : visited)
			if (x == false)
				return false;
		return true;
	}
	
	
	private int pop() {
		return stack[--top];
	}

	public void push(int value){
		stack[top++] = value;
	}
	
	/*function to find the reachable node from given node
	 * */
	public int[] reachable(int source) {
		int nodes[] = new int[vertices];
		for (int i=0; i<vertices; i++)
			if (adjacencyMatrix[source][i] != null)
				nodes[count++] = i;
		return nodes;
	}
	
	
	public int[] mst(int source) {
		boolean visited[] = new boolean[vertices];
		visited[source] = true;
		int keySource[] = new int[vertices];
		count = 0;
		keySource[count++] = source;
		while (count != vertices){
			findMinimumWeight(keySource, visited);
		}
		return keySource;
	}
	
	/*function to find the minimum weight in graph
	 * */
	private int findMinimumWeight(int[] keySource, boolean[] visited) {
		int minimum = Integer.MAX_VALUE, index = -1;
		for (int i=0; i<count; i++){
			for (int j=0; j<vertices; j++)
				if (adjacencyMatrix[keySource[i]][j] != null && visited[j] == false)
					if (adjacencyMatrix[keySource[i]][j].weight < minimum){
						minimum = adjacencyMatrix[keySource[i]][j].weight;
						index = j;
					}
		}
		keySource[count++] = index;
		visited[index] = true;
		total += minimum;
		return index;
	}

	/*function to find smallest path
	 * */
	int shortestPathDijk(int source, int destination, boolean[] visited) {
		visited[source] = true;
		for (int i=0; i<vertices; i++){
			if (source == destination){
				if (total1 < minimum)
					minimum = total1;
				return 0;
			}
			if (adjacencyMatrix[source][i] != null && visited[i] == false){
				visited[i] = true;
				total1 += adjacencyMatrix[source][i].weight;
				shortestPathDijk(i,destination,visited);
				total1 -= adjacencyMatrix[source][i].weight;
				visited[i] = false;
			}
		}
		return minimum;
	}

}
