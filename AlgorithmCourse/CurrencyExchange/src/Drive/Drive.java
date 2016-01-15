package Drive;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import Graph.BellmanFord;
import Graph.WeightedDigraph;

//http://www.geeksforgeeks.org/dynamic-programming-set-23-bellman-ford-algorithm/
public class Drive {
	public static void main(String[] args) {
		solve();
	}

	private static void solve() {
		WeightedDigraph graph = null;
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));

		String line = null;
		try {
			while ((line = reader.readLine()) != null) {
				String cleanLine = line.trim().toLowerCase()
						.replaceAll("\\s+", " ");
				String[] tokens = cleanLine.split("\\s+");

				if (tokens.length == 1) {
					int size = Integer.parseInt(tokens[0]);
					double[][] weights = new double[size][size];

					// Create a new weighted digraph
					graph = new WeightedDigraph(size, size * size);

					for (int i = 0; i < size; i++) {
						String otherLine = reader.readLine().trim()
								.toLowerCase().replaceAll("\\s+", " ");

						String[] values = otherLine.split("\\s+");
						int valueIndex = 0;
						for (int j = 0; j < size; j++) {
							weights[i][j] = Double
									.parseDouble(values[valueIndex]);
							valueIndex++;
						}
					}

					// Add edge into the weighted digraph
					for (int src = 0; src < size; src++) {
						for (int dest = 0; dest < size; dest++) {
							graph.addEdge(src, dest, weights[dest][src]);
						}
					}
				}

				// Find the best way to convert from src to dest
				BellmanFord.BellmanFordAlgorithm(graph, 5, 0);
				BellmanFord.BellmanFordAlgorithm(graph, 5, 1);
				BellmanFord.BellmanFordAlgorithm(graph, 5, 2);
				BellmanFord.BellmanFordAlgorithm(graph, 5, 3);
				BellmanFord.BellmanFordAlgorithm(graph, 5, 4);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
			System.exit(0);
		}
	}
}
