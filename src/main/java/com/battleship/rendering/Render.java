package com.battleship.rendering;


public class Render implements Rendering {
    //todo константы должны быть private +
    private static final String CELL_SHIP = "\uD83D\uDEE5";
    private static final String CELL_HALO = "\uD83D\uDFE6";
    private static final String CELL_WOUNDED = "\uD83D\uDFE5";
    private static final String CELL_EMPTY = "⬜";

    @Override
    public void drawField(String[][] array) {
        System.out.printf("%sA %sB %sC %sD %sF %sG %sH %sI %sG %sK%n", "\t", "\t", "\t", "\t", "\t", "\t", "\t", "\t", "\t", "\t");
        for (int i = 0; i < array.length; i++) {
            System.out.print(i + "\t");
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == null) {
                    array[i][j] = CELL_EMPTY;
                }
                if (array[i][j].equals("ship")) {
                    array[i][j] = CELL_SHIP;
                }
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

}
