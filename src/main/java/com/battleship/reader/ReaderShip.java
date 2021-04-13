package com.battleship.reader;

import com.battleship.rendering.Render;
import com.battleship.ship.Ship;

import java.util.Scanner;

public class ReaderShip implements Reader {
    private String[] split;
    private Ship shipPlayer = new Ship();

    @Override
    public void read(String namePlayer, String[][] arrayField) {
        System.out.println(namePlayer + ", расставляем ваши корабли на поле");

        // 4 т.к 4 вида корабля
        for (int i = 0; i < 4; i++) {
            if (i < 1) {
                countShips(1, arrayField);
            } else if (i < 2) {
                countShips(2, arrayField);
            } else if (i < 3) {
                countShips(3, arrayField);
            } else {
                countShips(4, arrayField);
            }
        }
    }

    private void placeShips(String[][] array) {
        for (String s : split) {
            int x = Integer.parseInt(s.substring(0, 1));
            int y = Integer.parseInt(s.substring(2, 3));
            array[x][y] = Render.CELL_SHIP;
        }
    }

    // Метод для подсчёта кораблей
    private void countShips(int count, String[][] array) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < count; i++) {
            System.out.println(nameShips(count));
            split = scanner.nextLine().split(";");
            placeShips(array);
        }
    }

    private String nameShips(int count) {
        String oneShips = "Введите координаты четырехпалубного корабля (формат: x,y;x,y;x,y;x,y)";
        String twoShips = "Введите координаты трехпалубного корабля (формат: x,y;x,y;x,y)";
        String threeShips = "Введите координаты двухпалубного корабля (формат: x,y;x,y)";
        String fourShips = "Введите координаты однопалубного корабля (формат: x,y)";

        return switch (count) {
            case 1 -> oneShips;
            case 2 -> twoShips;
            case 3 -> threeShips;
            case 4 -> fourShips;
            default -> "Таких кораблей нет";
        };
    }

}
