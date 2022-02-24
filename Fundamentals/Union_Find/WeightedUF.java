package Algorithm_fourth_java.Fundamentals.Union_Find;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class WeightedUF {
    private int[] id;
    private int[] sz;
    private int count;

    public WeightedUF(int N) {
        count = N;
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }

        sz = new int[N];
        for (int i = 0; i < N; i++) sz[i] = 1;
    }

    public int count() {
        return count;
    }

    public boolean connected(int p, int q) {
        return find(p) == find(q);
    }

    public int find(int p) {
        while (p != id[p]) p = id[p];
        return p;
    }

    public void union(int p, int q) {
        int i = find(p);
        int j = find(q);
        if (i == j) return;

        if (sz[i] < sz[j]) {
            id[i] = j;
            sz[j] += sz[i];
        } else {
            id[j] = i;
            sz[i] += sz[j];
        }
        count--;
    }


    public static void main(String[] args) {
        long time_1 = System.currentTimeMillis();
        int N = StdIn.readInt();
        WeightedUF uf = new WeightedUF(N);
        while (!StdIn.isEmpty()) {
            int p = StdIn.readInt();
            int q = StdIn.readInt();
            if (uf.connected(p, q)) continue;
            uf.union(p, q);
            StdOut.println(p + " " + q);
        }
        StdOut.println(uf.count() + " components");
        long time_2 = System.currentTimeMillis();
        System.out.println("Time used: " + (time_2 - time_1) + " ms");
        // quick find: 96 ms
        // quick union: 87 ms
        // weighted quick union: 89 ms
    }
}
