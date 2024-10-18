package Graph;

import java.util.ArrayList;


public class Classroom {

    static class Edge{
        int src , dest;

        public Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }
    public static void createGraph(ArrayList<Edge> [] graph ){  // adjacency list
        for(int i=0;i< graph.length;i++){
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0,2));

        graph[1].add(new Edge(1,2));
        graph[1].add(new Edge(1,3));

        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,1));
        graph[2].add(new Edge(2,3));

        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,2));
    }

    public static int[][] adjacencyMatrix(ArrayList<Edge>[] graph, int v) {
        int[][] matrix = new int[v][v];
        for (int i = 0; i < v; i++) {
            for (Edge e : graph[i]) {
                matrix[e.src][e.dest] = 1;
            }
        }
        return matrix;
    }


    public static void main(String[] args) {

        int v = 4;
        ArrayList<Edge>[] graph = new  ArrayList[v];
        // print neighbour of 2
        createGraph(graph);

        for(int i=0;i<graph[3].size();i++){
            Edge e = graph[3].get(i);
            System.out.print(e.dest+" ");
        }


        createGraph(graph);
        int [] [] output = adjacencyMatrix(graph,v);
       for(int i=0;i<v;i++){
           for(int j=0;j<v;j++){
               System.out.print(output[i][j] + " ");
           }
           System.out.println();
       }

    }



}
