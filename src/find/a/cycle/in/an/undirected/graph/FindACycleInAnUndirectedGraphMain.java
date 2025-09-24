package find.a.cycle.in.an.undirected.graph;

public class FindACycleInAnUndirectedGraphMain {

    public static void main(String[] args) {
        int[][] edges = new int[][]{{1, 2}, {1, 3}, {2, 4}, {5, 6}, {7, 8}, {8, 9}, {7, 9}};
        FindACycleInAnUndirectedGraph solution = new FindACycleInAnUndirectedGraph();
        System.out.println(solution.solution(edges, 9));
    }

}
