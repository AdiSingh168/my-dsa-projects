package disjoint_set;

public class DisjointSet {

    private final int[] rank;
    private final int[] parent;
    private final int[] size;

    public DisjointSet(int n) {
        rank = new int[n + 1];
        parent = new int[n + 1];
        size = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            rank[i] = 0;
            parent[i] = i;
            size[i] = 1;
        }

    }

    public int findUltimateParent(int node) {
        if (node == parent[node]) {
            return node;
        }
        return parent[node] = findUltimateParent(parent[node]);
    }

    public void unionByRank(int u, int v) {
        int ult_u = findUltimateParent(u);
        int ult_v = findUltimateParent(v);

        if (ult_v == ult_u) {
            return;
        }
        if (rank[ult_v] == rank[ult_u]) {
            parent[ult_v] = ult_u;
            rank[ult_u]++;
        } else if (rank[ult_v] > rank[ult_u]) {
            parent[ult_u] = ult_v;
        } else {
            parent[ult_v] = ult_u;
        }
    }

    public void unionBySize(int u, int v){
        int ult_u = findUltimateParent(u);
        int ult_v = findUltimateParent(v);

        if(ult_u == ult_v){
            return;
        }
        if(size[ult_u] > size[ult_v]){
            parent[ult_v] = ult_u;
            size[ult_u] += size[ult_v];
        } else {
            parent[ult_u] = ult_v;
            size[ult_v] += size[ult_u];
        }
    }

}
