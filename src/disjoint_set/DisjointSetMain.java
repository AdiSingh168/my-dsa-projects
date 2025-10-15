package disjoint_set;

public class DisjointSetMain {

    public static void main(String[] args) {
        testUnionByRank();
        testUnionBySize();
    }

    private static void testUnionByRank() {
        System.out.println("testUnionByRank starts");
        DisjointSet ds = new DisjointSet(7);

        ds.unionByRank(1, 2);
        ds.unionByRank(2, 3);
        ds.unionByRank(4, 5);
        ds.unionByRank(6, 7);
        ds.unionByRank(5, 6);

        System.out.println(
                ds.findUltimateParent(3) == ds.findUltimateParent(7)
                        ? "Same"
                        : "Not Same"
        );

        ds.unionByRank(3, 7);

        System.out.println(
                ds.findUltimateParent(3) == ds.findUltimateParent(7)
                        ? "Same"
                        : "Not Same"
        );
        System.out.println("testUnionByRank ends\n\n\n");
    }

    private static void testUnionBySize() {
        System.out.println("testUnionBySize starts");
        DisjointSet ds = new DisjointSet(7);

        ds.unionBySize(1, 2);
        ds.unionBySize(2, 3);
        ds.unionBySize(4, 5);
        ds.unionBySize(6, 7);
        ds.unionBySize(5, 6);

        System.out.println(
                ds.findUltimateParent(3) == ds.findUltimateParent(7)
                        ? "Same"
                        : "Not Same"
        );

        ds.unionBySize(3, 7);

        System.out.println(
                ds.findUltimateParent(3) == ds.findUltimateParent(7)
                        ? "Same"
                        : "Not Same"
        );
        System.out.println("testUnionBySize ends\n\n\n");
    }

}
