public class Ship {
    private int[][] field = new int[10][10];
    private int[][] firstShips;
    private int[][] secondShips;

    public Ship(int[][] field) {
        this.field = field;
    }

    public int[][] getFirstShips() {
        return firstShips;
    }

    public void setFirstShips(int[][] firstShips) {
        this.firstShips = firstShips;
    }

    public int[][] getSecondShips() {
        return secondShips;
    }

    public void setSecondShips(int[][] secondShips) {
        this.secondShips = secondShips;
    }
}
