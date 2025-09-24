package find.a.cycle.in.an.undirected.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FindACycleInAnUndirectedGraph {

    public String solution(int[][] edges, int n) {
        String YES = "Yes";
        String NO = "No";

        List<List<Integer>> adjacencyList = getAdjacencyList(edges, n);
        boolean[] visited = new boolean[n + 1];
        for (int i = 1; i <= n; i++) {
            if (visited[i]) {
                continue;
            }

            Queue<Pair> q = new LinkedList<>();
            q.offer(new Pair(i, 0));
            visited[i] = true;

            while (!q.isEmpty()) {
                Pair element = q.poll();
                int elementMark = element.getValue();
                int parent = element.getParent();
                for (Integer neighbor : adjacencyList.get(elementMark)) {
                    if (!visited[neighbor]) {
                        visited[neighbor] = true;
                        q.offer(new Pair(neighbor, elementMark));
                    } else if (neighbor != parent) {
                        return YES;
                    }
                }
            }
        }
        return NO;
    }

    private List<List<Integer>> getAdjacencyList(int[][] edges, int n) {
        List<List<Integer>> adjacencyList = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            adjacencyList.add(new ArrayList<Integer>());
        }

        for (int[] edge : edges) {
            adjacencyList.get(edge[0]).add(edge[1]);
            adjacencyList.get(edge[1]).add(edge[0]);
        }

        return adjacencyList;
    }

}

class Pair{
    int value, parent;

    Pair(){}

    Pair(int _value, int _parent){
        this.value = _value;
        this.parent = _parent;
    }

    int getValue(){
        return this.value;
    }

    int getParent(){
        return this.parent;
    }

    @Override
    public String toString(){
        return String.format("[%s] = [%s]", this.value, this.parent);
    }
}
