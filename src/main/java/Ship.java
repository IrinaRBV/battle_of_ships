public class Ship {
    private String[][] firstPlayerField = new String[10][10];
    private String[][] secondPlayerField = new String[10][10];
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String[][] getFirstPlayerField() {
        return firstPlayerField;
    }

    public void setFirstPlayerField(String[][] firstPlayerField) {
        this.firstPlayerField = firstPlayerField;
    }

    public String[][] getSecondPlayerField() {
        return secondPlayerField;
    }

    public void setSecondPlayerField(String[][] secondPlayerField) {
        this.secondPlayerField = secondPlayerField;
    }
}
