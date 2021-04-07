package com.battleship.rendering;


import com.battleship.ship.Ship;

public class Field implements Rendering {
    public static final String CELL_SHIP = "\uD83D\uDEE5";
    public static final String CELL_HALO = "\uD83D\uDFE6";
    public static final String CELL_WOUNDED = "\uD83D\uDFE5";
    public static final String CELL_EMPTY = "⬜";

    @Override
    public void drawField() {
        addCell(Ship.firstShipsFields);
    }

    public void addCell(String[][] array) {
        System.out.printf("%sA %sB %sC %sD %sF %sG %sH %sI %sG %sK%n", "\t", "\t", "\t", "\t", "\t", "\t", "\t", "\t", "\t", "\t");
        for (int i = 0; i < array.length; i++) {
            System.out.print(i + "\t");
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == null) {
                    array[i][j] = CELL_EMPTY;
                }
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

}
