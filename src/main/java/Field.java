import java.util.Arrays;

public class Field implements Rendering {
    private String cellShip = "\uD83D\uDEE5";
    private String cellHalo = "\uD83D\uDFE6";
    private String cellWounded = "\uD83D\uDFE5";
    private String cellEmpty = "⬜";
//    ReaderShip readerShip = new ReaderShip();

    public String getCellShip() {
        return cellShip;
    }

    public String getCellEmpty() {
        return cellEmpty;
    }

    @Override
    public void drawField() {
//        readerShip.read();
        addCell(Ship.firstShipsFields);
//        addCell(Ship.secondShipsFields);
    }

    public void addCell(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == null) {
                    array[i][j] = cellEmpty;
                }
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // Куда пихать этот метод хз пока
    public void drawMarks() {
        System.out.println("A B C D F G H I G K");
        for (int i = 1; i < 11; i++) {
            System.out.print(i + " ");
        }
    }


}
