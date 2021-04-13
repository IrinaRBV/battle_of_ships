import com.battleship.reader.NewReader;
import com.battleship.reader.ShipReader;
import com.battleship.rendering.Render;

public class Main {
    public static void main(String[] args) {
       /* ReaderShip ship = new ReaderShip();
        Render render = new Render();
        ship.read("Milli", Ship.firstShipsFields);
        render.addCell(Ship.firstShipsFields);

        ship.read("Tani", Ship.secondShipsFields);
        render.addCell(Ship.secondShipsFields);
*/
        NewReader reader = new ShipReader();
        Render render = new Render();
        //todo записывать в com.battleship.ship.Ship.firstShipsFields
        String[][] tanyas = reader.read("Tanya");
        render.drawField(tanyas);
        //todo записывать в com.battleship.ship.Ship.secondShipsFields
        String[][] dimas = reader.read("Dima");
        render.drawField(dimas);
    }
}
