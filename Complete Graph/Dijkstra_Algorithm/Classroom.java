package Dijkstra_Algorithm;

import java.util.ArrayList;
import java.util.PriorityQueue;


public class Classroom {

    static class Edge{
        int src , dest,wt;

        public Edge(int src, int dest,int wt) {
            this.src = src;
            this.dest = dest;
            this.wt=wt;
        }
    }
    public static void createGraph(ArrayList<Edge> [] graph ){  // adjacency list
        for(int i=0;i< graph.length;i++){
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

    public static class Pair implements  Comparable<Pair>{
    int source,destination;

        public Pair(int source, int destination) {
            this.source = source;
            this.destination = destination;
        }

        @Override
        public int compareTo(Pair p2) {
            return this.destination-p2.destination;
        }
    }
    // end of class

    public void dijkstra_Algorithm(ArrayList<Edge> [] graph,int src,int v){
        PriorityQueue<Pair> pairPriorityQueue = new PriorityQueue<>();
        int [] distance = new int[v];
        for(int i=0;i<distance.length;i++){
            if(i!=src){
                distance[i]=Integer.MAX_VALUE;
            }
        }
        boolean [] isVisited = new boolean[v];
        pairPriorityQueue.add(new Pair(0,0));
      while(!pairPriorityQueue.isEmpty()){
    Pair current = pairPriorityQueue.remove();
    if(!isVisited[current.source]){
        isVisited[current.source]=true;
        for(int i=0;i<graph[current.source].size();i++){
            Edge e = graph[current.source].get(i);
            int u=e.src;
            int ver=e.dest;
            if(distance[u]+e.wt<distance[ver]){  // Relaxation
                distance[ver]=distance[u]+e.wt;
                pairPriorityQueue.add(new Pair(ver,distance[ver]));
            }
        }
    }
}
      for(int i=0;i<v;i++){
          System.out.print(distance[i]+" ");
      }
        System.out.println();

    }




    public static void main(String[] args) {

        int v = 4;
        ArrayList<Edge>[] graph = new  ArrayList[v];

        createGraph(graph);

        Classroom c1 = new Classroom();
        c1.dijkstra_Algorithm(graph,1,4);



    }



}
