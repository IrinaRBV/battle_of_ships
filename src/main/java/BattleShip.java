public class BattleShip implements Play {


    @Override
    public void addShip() {

        Reader reader = new ReaderShip();
        reader.read();

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
