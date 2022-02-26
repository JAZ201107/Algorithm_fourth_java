package Algorithm_fourth_java.Fundamentals.Percolation;

public class Percolation {

    private int[][] a;

    public Percolation(int n) {
        a = new int[n][n];
    }

    public void open(int row, int col) {
        a[row - 1][col - 1] = 1;
    }

    public boolean isOpen(int row, int col) {
        return a[row - 1][col - 1] == 1;
    }

    public boolean isFull(int row, int col) //?
    {

    }


    public  int numberOfOpenSites()
    {

    }

    public boolean percolates()
    {

    }

    public static void main(String[] args) {

    }
}
