public class Field implements Rendering {
    private String cellShip = "\uD83D\uDEE5";
    private String cellHalo = "\uD83D\uDFE6";
    private String cellWounded = "\uD83D\uDFE5";
    private String cellEmpty = "⬜";
    private int x;
    private int y;
    Ship ship = new Ship();

    @Override
    public void drawField() {
//        ReaderShip readerShip = new ReaderShip();
//        String[][] firstField = new String[10][10];
//        String[][] secondField = new String[10][10];
//        firstField[x][y] = cellShip;
//        ship.setFirstShipsFields(firstField);

    }


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

}
