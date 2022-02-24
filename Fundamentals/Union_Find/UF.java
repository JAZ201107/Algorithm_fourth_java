package Algorithm_fourth_java.Fundamentals.Union_Find;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class UF {
    private int[] id;
    private int count;

    public UF(int N) {
        count = N;
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    public int count() {
        return count;
    }

    public boolean connected(int p, int q) {
        return find(p) == find(q);
    }

    // ======== quick find ===========
//    public int find(int p) {
//        return id[p];
//    }
//
//    public void union(int p, int q) {
//        // p = 9 , q = 4
//        // 0 1 2 3 4 5 6 7 8 9 index
//        // 0 1 2 8 8 5 5 7 8 9 value
//        int pID = find(p); // pID = 9
//        int qID = find(q); // qID = 8
//
//        if (pID == qID) return;
//        for (int i = 0; i < id.length; i++) {
//            if (id[i] == pID) id[i] = qID;
//        }
//        count--;
//    }
    // ======== end quick find ===========

    // ============= quick union =============
    private int find(int p)
    {

    }

    // ============= end quick union =============

    public static void main(String[] args) {
        int N = StdIn.readInt();
        UF uf = new UF(N);
        while(!StdIn.isEmpty())
        {
            int p = StdIn.readInt();
            int q = StdIn.readInt();
            if(uf.connected(p,q)) continue;
            uf.union(p,q);
            StdOut.println(p+" "+q);
        }
        StdOut.println(uf.count()+ " components");
    }


}
