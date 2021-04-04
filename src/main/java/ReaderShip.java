import java.util.Arrays;
import java.util.Scanner;

public class ReaderShip implements Reader {
    private String[] split;
    Field fieldPlayer = new Field();
    Ship shipPlayer = new Ship();
    String[][] array = new String[10][10];
    Scanner scanner = new Scanner(System.in);


    @Override
    public void read(String namePlayer) {
        System.out.println(namePlayer + ", расставляем ваши корабли на поле");

        // 4 т.к 4 вида корабля
        for (int i = 0; i < 4; i++) {
            if (i < 1) {
                countShips(1);
            } else if (i < 2) {
                countShips(2);
            } else if (i < 3) {
                countShips(3);
            } else {
                countShips(4);
            }
        }
    }

    public void placeShips() {
        for(int i = 0; i < split.length; i++) {
            String s = split[i];
            int x = Integer.parseInt(s.substring(0,1));
            int y = Integer.parseInt(s.substring(2,3));
            array[x][y] = fieldPlayer.getCellShip();
            shipPlayer.setFirstShipsFields(array);
        }
    }

    // Метод для подсчёта кораблей
    public void countShips(int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(nameShips(count));
            split = scanner.nextLine().split(";");
            placeShips();
        }
    }

    public String nameShips(int count) {
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
