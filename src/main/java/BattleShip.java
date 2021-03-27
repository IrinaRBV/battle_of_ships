import java.awt.*;
import java.util.Scanner;

public class BattleShip implements Play {
    private String fourDeckShip =  "Введите координаты четырехпалубного корабля (формат: x,y;x,y;x,y;x,y;)";
    private String threeDeckShip =  "Введите координаты трехпалубного корабля (формат: x,y;x,y;x,y)";
    private String twoDeckShip =  "Введите координаты двухпалубного корабля (формат: x,y;x,y)";
    private String oneDeckShip =  "Введите координаты однопалубного корабля (формат: x,y)";
    private int x;
    private int y;
    private String emptyCell = "⬜";
    private String woundedCell = "\uD83D\uDFE5";
    private String shipCell = "\uD83D\uDEE5";
    private String shipHalo = "\uD83D\uDEE5";
    int tempCoordinate = 0;


    @Override
    public void addShip() {
        System.out.println("Начнем расставлять корабли для Player1");
        String[] player1 = new String[10];
        Scanner scanner = new Scanner(System.in);

        // Цикл на расстановку кораблей
        for (int i = 0; i < 10; i++) {
            // Условие, которое считает корабли
            if(i == 0) {
                System.out.println(fourDeckShip);
                // Цикл считает координаты
                for (int j = 0; j < 4; j++) {
                    player1 = scanner.nextLine().split(";");
                    for (String numberArray : player1) {
                        x = Integer.parseInt(numberArray);
                        y = Integer.parseInt(numberArray);

                    }
//                    player1[x][y] = shipCell;

                }

            } else if( i < 3) {
                System.out.println(threeDeckShip);
                for (int j = 0; j < 3; j++) {
                    x = scanner.nextInt();
                    y = scanner.nextInt();
                    player1[x][y] = shipCell;
                }

            } else if(i < 6) {
                System.out.println(twoDeckShip);
                for (int j = 0; j < 2; j++) {
                    x = scanner.nextInt();
                    y = scanner.nextInt();
                    player1[x][y] = shipCell;
                }

            } else {
                System.out.println(oneDeckShip);
                for (int j = 0; j < 1; j++) {
                    x = scanner.nextInt();
                    y = scanner.nextInt();
                    player1[x][y] = shipCell;
                }

            }

        }


//        for (int i = 0; i < player1.length; i++) {
//            for (int j = 0; j < player1[i].length; j++) {
//                System.out.println(player1[i][j] + "\t");
//            }
//            System.out.println();
//        }

        scanner.close();
    }

    @Override
    public void shotFirst() {

    }

    @Override
    public boolean shot(int x, int y) {
        return false;
    }

    @Override
    public boolean wounded() {
        return false;
    }

    @Override
    public boolean doNotWounded() {
        return false;
    }

    @Override
    public void isWin() {

    }
}
