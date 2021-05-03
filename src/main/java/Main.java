import com.battleship.reader.NewReader;
import com.battleship.reader.ShipReader;
import com.battleship.rendering.Render;
import com.battleship.ship.Field;

public class Main {
    public static void main(String[] args) {
        Field fields = new Field();
        NewReader reader = new ShipReader();
        Render render = new Render();
        //todo записывать в com.battleship.ship.Ship.firstShipsFields +
        fields.setFirstFields(reader.read("Tanya"));
        render.drawField(fields.getFirstFields());
        //todo записывать в com.battleship.ship.Ship.secondShipsFields +
        fields.setSecondFields(reader.read("Dima"));
        render.drawField(fields.getSecondFields());
    }
}
