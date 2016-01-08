package Solution;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import ShortestPath.DijkstraAlgorithm;
import ShortestPath.Edge;
import ShortestPath.Graph;
import ShortestPath.Vertex;

// http://www.vogella.com/tutorials/JavaAlgorithmsDijkstra/article.html
// https://www.cs.princeton.edu/~rs/AlgsDS07/15ShortestPaths.pdf
public class Driver {
	private static List<Vertex> nodes = null;
	private static List<Edge> edges = null;

	public static void main(String[] args) {
		nodes = new ArrayList<Vertex>();
		edges = new ArrayList<Edge>();
		for (int i = 0; i <= 5; i++) {
			Vertex location = new Vertex("Node_" + i, "Node_" + i);
			nodes.add(location);
		}

		addLane("Edge_1", 0, 2, 10.0);
		addLane("Edge_2", 0, 5, 100.0);
		addLane("Edge_5", 2, 3, 20.0);
		addLane("Edge_7", 3, 5, 20.0);

		// Lets check from location Loc_1 to Loc_10
		Graph graph = new Graph(nodes, edges);
		DijkstraAlgorithm dijkstra = new DijkstraAlgorithm(graph);
		dijkstra.execute(nodes.get(0));

		LinkedList<Vertex> path = dijkstra.getPath(nodes.get(5));

		if (path == null) {
			System.out.println("No paths");
		} else {
			for (Vertex vertex : path) {
				System.out.println(vertex);
			}
			System.out.println("shortest distances : "
					+ dijkstra.getShortestDistance(nodes.get(5)));
		}
	}

	private static void addLane(String laneId, int sourceLocNo, int destLocNo,
			double duration) {
		Edge lane = new Edge(laneId, nodes.get(sourceLocNo),
				nodes.get(destLocNo), duration);
		edges.add(lane);
	}
}
