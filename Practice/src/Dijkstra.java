import java.util.*;

public class Dijkstra {

    private static final int MAX = 10005;  // Maximum number of nodes
    private static final int INF = 1000000000;  // Infinity
    private static ArrayList<Pair>[] adjList = new ArrayList[MAX];  // Adjacency list
    private static int[] dist = new int[MAX];  // Distance from source
    private static boolean[] visited = new boolean[MAX];  // Whether node is visited

    private static void dijkstra(int source) {
        Arrays.fill(dist, INF);  // Initialize all distances to infinity
        PriorityQueue<Pair> pq = new PriorityQueue<Pair>();  // Priority queue to store nodes
        pq.offer(new Pair(source, 0));  // Add source node with distance 0
        dist[source] = 0;  // Set distance of source node to 0

        while (!pq.isEmpty()) {
            Pair cur = pq.poll();  // Extract node with smallest distance
            int u = cur.first;
            if (visited[u]) continue;  // Skip visited nodes
            visited[u] = true;  // Mark node as visited

            for (Pair next : adjList[u]) {  // Loop over neighbors of current node
                int v = next.first;
                int weight = next.second;
                if (dist[u] + weight < dist[v]) {  // Update distance if shorter path is found
                    dist[v] = dist[u] + weight;
                    pq.offer(new Pair(v, dist[v]));  // Add updated node to queue
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // Number of nodes
        int m = sc.nextInt();  // Number of edges

        for (int i = 0; i < n; i++) {
            adjList[i] = new ArrayList<Pair>();  // Initialize adjacency list
        }

        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            int w = sc.nextInt();
            adjList[u].add(new Pair(v, w));  // Add edge to adjacency list
            adjList[v].add(new Pair(u, w));  // Add reverse edge to adjacency list
        }

        int source = sc.nextInt();  // Source node
        int dest = sc.nextInt();  // Destination node

        dijkstra(source);  // Run Dijkstra's algorithm

        if (dist[dest] == INF) {
            System.out.println("No path found from " + source + " to " + dest);
        } else {
            System.out.println("Shortest distance from " + source + " to " + dest + " is " + dist[dest]);
        }

        sc.close();
    }
}

class Pair implements Comparable<Pair> {
    int first;
    int second;

    public Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public int compareTo(Pair other) {
        return Integer.compare(second, other.second);
    }
}
