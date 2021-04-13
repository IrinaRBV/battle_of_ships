package com.battleship.reader;

import java.util.Scanner;

/**
 * @author Anastasia Fomkina
 * @since 13.04.2021
 */
public class ShipReader implements NewReader {

    private static final int BATTLE_SHIP = 4;
    private static final int DESTROYER = 3;
    private static final int SUBMARINE = 2;
    private static final int CRUISER = 1;

    private static final String SHIP = "ship";

    @Override
    public String[][] read(String namePlayer) {
        System.out.println(namePlayer + ", расставляем ваши корабли на поле");
        String[][] array = new String[10][10];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            if (i == 0) { // подумать, как можно избавиться от константных значений (0)
                System.out.println("Введите координаты четырехпалубного корабля (формат: x,y;x,y;x,y;x,y)");
                setShip(array, scanShip(scanner, BATTLE_SHIP));
            }
            if (i >= 1 && i <= 2) { // подумать, как можно избавиться от константных значений (1,2)
                System.out.println("Введите координаты трехпалубного корабля (формат: x,y;x,y;x,y)");
                setShip(array, scanShip(scanner, DESTROYER));
            }
            if (i >= 3 && i <= 5) { // подумать, как можно избавиться от константных значений (3,5)
                System.out.println("Введите координаты двухпалубного корабля (формат: x,y;x,y)");
                setShip(array, scanShip(scanner, SUBMARINE));
            }
            if (i >= 6) { // подумать, как можно избавиться от константных значений (6)
                System.out.println("Введите координаты однопалубного корабля (формат: x,y)");
                setShip(array, scanShip(scanner, CRUISER));
            }
        }
        return array;
    }

    private void setShip(String[][] array, String[] ship) {
        for (String s : ship) {
            int x = Integer.parseInt(s.substring(0, 1));
            int y = Integer.parseInt(s.substring(2, 3));
            array[x][y] = SHIP;
        }
    }

    private String[] scanShip(Scanner scanner, int count) {
        //todo добавить метод, который убирает всю лишнюю гадость из scanner.nextLine(), а потом уже разделять на String[]
        //todo добавить метод, который заменяет все точки на запятые
        String[] ship = scanner.nextLine().split(";");
        //todo расширить проверку на адекватность корабля (например, чтобы он был цельным)
        checkShip(scanner, ship, count);
        return ship;
    }

    private void checkShip(Scanner scanner, String[] ship, int count) {
        while (!isCorrectShip(ship, count)) {
            System.out.printf("Введен %s - палубный корабль. Попробуй еще раз: %n", ship.length);
            ship = scanner.nextLine().split(";");
        }
    }

    private boolean isCorrectShip(String[] ship, int count) {
        return ship.length == count;
    }
}
