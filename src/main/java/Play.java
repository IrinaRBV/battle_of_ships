public interface Play {
    void addShip(Ship ship);
    void shotFirst();
    boolean shot(int x, int y);
    boolean wounded();
    boolean doNotWounded();
    void isWin();
}
