import com.battleship.reader.ReaderShip;
import com.battleship.rendering.Field;
import com.battleship.ship.Ship;

public class Main {
    public static void main(String[] args) {
        ReaderShip ship = new ReaderShip();
        Field field = new Field();
        ship.read("Milli", Ship.firstShipsFields);
        field.addCell(Ship.firstShipsFields);

        ship.read("Tani", Ship.secondShipsFields);
        field.addCell(Ship.secondShipsFields);

    }
}
