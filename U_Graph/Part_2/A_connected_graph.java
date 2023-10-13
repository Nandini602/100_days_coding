
import java.util.*;
public class A_coonected_graph{
//o(v+E)

    static class Edge{
        int src;
        int dest;
        int wt;

        public Edge(int s, int d ,int w){
            this.src =s;
            this.dest = d; 
            this.wt = w;
        } 

    } 
    static void creationGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length; i++){
            graph[i] = new ArrayList<>();
        } 

        graph[0].add(new Edge(0,1,1));
        graph[0].add(new Edge(0,2,1)); 

        graph[1].add(new Edge(0,1,1));
        graph[1].add(new Edge(1,3,1)); 
        
        graph[2].add(new Edge(2,0,1));
        graph[2].add(new Edge(2,4,1)); 

        graph[3].add(new Edge(3,1,1));
        graph[3].add(new Edge(3,4,1));
        graph[3].add(new Edge(3,5,1)); 


        graph[4].add(new Edge(4,2,1));
        graph[4].add(new Edge(4,3,1));
        graph[4].add(new Edge(4,5,1)); 

        graph[5].add(new Edge(5,3,1));
        graph[5].add(new Edge(5,4,1)); 
        graph[5].add(new Edge(5,6,1));
        graph[5].add(new Edge(6,5,1));
        
    }  
  
    //bfs
    public static void bfs(ArrayList<Edge>graph[]){
           boolean vis[] = new boolean(graph.length);
           for(int i=0;i<graph.length;i++){
            if(!vis[i]){
                bfsUtil(graph , vis);
            }
           }
    }

     public static void bfsUtil (ArrayList<Edge>[] graph,boolean vis[]){// helper function
        Queue<Integer> q = new LinkedList<>(); 
        boolean vis[] = new boolean[graph.length]; 
        q.add(0); // source = 0;

        while(!q.isEmpty()){
            int curr = q.remove();

            if(!vis[curr]){ // visit curr 
                System.out.print(curr + " ");
                vis[curr] = true; 
                for(int i=0;i<graph[curr].size();i++){
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }

            }
        }
    }


        //bfs
     public static void dfs(ArrayList<Edge>graph[]){
           boolean vis[] = new boolean(graph.length);
           for(int i=0;i<graph.length;i++){
            {
                dfsUtil(graph ,i, vis);
            }
           }
    }

   

    public static void dfsUtil(ArrayList<Edge>[]graph, int curr,boolean vis[]){
        //visit 
        System.out.print(curr + " "); 
        vis[curr] = true; 

        for(int i=0;i<graph[curr].size();i++){ 
            Edge e = graph[curr].get(i);
           if(!vis[e.dest]){
            dfsUtil(graph,e.dest,vis);
           }
        }
    }

        public static void main(String args[]){
            /*
                    1-------3 
                   /         \ 
                  0           5----6 
                 /            / 
                 2----------4 
 

                    weight is 1
             */ 

            int v = 7;
            ArrayList<Edge> graph[] = new ArrayList[v]; 
            creationGraph(graph); 
            bfs(graph);
            dfs(graph);
        }

}