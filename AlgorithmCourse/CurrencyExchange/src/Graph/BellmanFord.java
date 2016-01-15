package Graph;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;

// A Java program for Bellman-Ford's single source shortest path algorithm.
public class BellmanFord {
	// The main function that finds shortest distances from src to all other
	// vertices using Bellman-Ford algorithm. The function also detects negative
	// weight cycle
	public static void BellmanFordAlgorithm(WeightedDigraph graph, int src,
			int dest) {
		int V = graph.getVertexNum();
		int E = graph.getEdgeNum();
		double distances[] = new double[V];
		Edge predecessor[] = new Edge[V];

		// Step 1: Initialize distances from src to all other vertices as
		// INFINITE
		for (int i = 0; i < V; ++i) {
			distances[i] = Integer.MAX_VALUE;
		}
		distances[src] = 0;

		// Step 2: Relax all edges |V| - 1 times. A simple shortest path from
		// src to any other vertex can have at-most |V| - 1 edges
		for (int i = 1; i < V; ++i) {
			for (int j = 0; j < E; ++j) {
				Edge edge = graph.getEdges(j);
				int u = edge.getSrc();
				int v = edge.getDest();
				double weight = edge.getLogScaleWeight();
				if (distances[u] != Integer.MAX_VALUE
						&& distances[u] + weight < distances[v]) {
					distances[v] = distances[u] + weight;
					predecessor[v] = graph.getEdges(j);
				}
			}
		}

		// Step 3: check for negative-weight cycles. The above step guarantees
		// shortest distances if graph doesn't contain negative weight cycle. If
		// we get a shorter path, then there is a cycle.
		for (int j = 0; j < E; ++j) {
			Edge edge = graph.getEdges(j);
			int u = edge.getSrc();
			int v = edge.getDest();
			double weight = edge.getLogScaleWeight();
			if (distances[u] != Integer.MAX_VALUE
					&& distances[u] + weight < distances[v])
				System.out.println("Graph contains negative weight cycle");
		}

		printDistanceMatrix(distances, predecessor, V);
		printPath(distances, predecessor, src, dest);
	}

	// A utility function used to print the distance matrix
	public static void printDistanceMatrix(double dist[], Edge predecessor[],
			int V) {
		System.out.println("Vertex\tDistance\t\tSource ");
		for (int i = 0; i < V; ++i) {
			NumberFormat formatter = new DecimalFormat("#0.0000");
			System.out.print(i + "\t\t" + formatter.format(dist[i]));
			if (predecessor[i] != null) {
				System.out.println("\t\t" + predecessor[i].toString());
			} else {
				System.out.println("\t\t-");
			}
		}
	}

	// A utility function used to print the solution
	public static void printPath(double dist[], Edge predecessor[], int src,
			int dest) {
		Edge edge = predecessor[dest];
		ArrayList<Integer> path = new ArrayList<Integer>();
		double value = 1;
		while (edge != null && edge.getDest() != src) {
			path.add(edge.getDest());
			value *= edge.getWeight();
			edge = predecessor[edge.getSrc()];
		}
		
		if(edge != null) {
			path.add(edge.getDest());
		} else {
			path.add(src);
		}

		// Reverses path
		Collections.reverse(path);
		System.out.println(path.toString() + " : " + value);
		System.out.println();
	}
}
