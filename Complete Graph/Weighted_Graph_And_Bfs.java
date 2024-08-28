package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Weighted_Graph_And_Bfs {


    static class Edge {
        int src, dest, weight;

        public Edge(int src, int dest, int weight) {
            this.src = src;
            this.dest = dest;
            this.weight = weight;
        }
    }

    // Breath First Search (BFS)  --> when the graph is whole single entity
 // Dijkstra's Algorithm works on BFS --> visit all nodes of a current then move to the next level
    public static void bfs(ArrayList<Edge>[] graph, int v) {
        Queue<Integer> q = new LinkedList<>();
        boolean[] vis = new boolean[v];
        q.add(0);
        while (!q.isEmpty()) {
            int curr = q.peek();
            q.remove();
            if (!vis[curr]) {
                System.out.print(curr + " ");
                vis[curr] = true;

                for (int i = 0; i < graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }


    public static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 2, 2));

        graph[1].add(new Edge(1, 2, 10));
        graph[1].add(new Edge(1, 3, 0));

        graph[2].add(new Edge(2, 0, 2));
        graph[2].add(new Edge(2, 1, 10));
        graph[2].add(new Edge(2, 3, -1));

        graph[3].add(new Edge(3, 1, 0));
        graph[3].add(new Edge(3, 2, -1));
    }

    public static int[][] adjacencyMatrix(ArrayList<Edge>[] graph, int v) {
        int[][] matrix = new int[v][v];
        for (int i = 0; i < v; i++) {
            for (Edge e : graph[i]) {
                matrix[e.src][e.dest] = e.weight;
            }
        }
        return matrix;
    }

    public static void main(String[] args) {

        int v = 4;
        ArrayList<Edge>[] graph = new ArrayList[v];
        // print neighbour of 2
        createGraph(graph);

        for (int i = 0; i < graph[3].size(); i++) {
            Edge e = graph[3].get(i);
            System.out.print(" " + e.dest + " : " + e.weight);
        }

        createGraph(graph);
        System.out.println();
        bfs(graph, v);
        System.out.println();

        int[][] output = adjacencyMatrix(graph, v);
        System.out.println("Adjacency Matrix : ");
        for (int i = 0; i < v; i++) {
            for (int j = 0; j < v; j++) {
                System.out.print(output[i][j] + "  ");
            }
            System.out.println();


        }


    }
}






// Breath First Search (BFS)  --> when the graph is not a whole single entity but exist in different components


 /*   public static void bfs(ArrayList<Edge> [] graph , int v,boolean [] vis, int start){
        Queue<Integer> q = new LinkedList<>();

        q.add(start);
        while (!q.isEmpty()){
            int curr = q.peek();
            q.remove()     ;
            if(!vis[curr]){
                System.out.print(curr+" ");
                vis[curr] = true;

                for(int i  =0;i<graph[curr].size();i++){
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }

put this extra lines in the main method

    boolean [] vis = new boolean[v];;
            for(int i=0;i<v;i++){
        if(!vis[i]){
        bfs(graph,v,vis,i);
        }
        }






*/












