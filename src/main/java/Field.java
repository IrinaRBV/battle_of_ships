import java.util.Arrays;

public class Field implements Rendering {
    private String cellShip = "\uD83D\uDEE5";
    private String cellHalo = "\uD83D\uDFE6";
    private String cellWounded = "\uD83D\uDFE5";
    private String cellEmpty = "⬜";

    public String getCellShip() {
        return cellShip;
    }

    public String getCellEmpty() {
        return cellEmpty;
    }

    @Override
    public void drawField() {
        addCell(Ship.firstShipsFields);
    }

    public void addCell(String[][] array) {
        System.out.println(String.format("%sA %sB %sC %sD %sF %sG %sH %sI %sG 2%sK", "\t", "\t", "\t", "\t", "\t", "\t", "\t", "\t", "\t", "\t"));
        for (int i = 0; i < array.length; i++) {
            System.out.print(i + "\t");
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == null) {
                    array[i][j] = cellEmpty;
                }
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

}
