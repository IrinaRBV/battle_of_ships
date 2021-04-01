public interface Play {
    void addShip();
    void shotFirst();
    boolean shot(int x, int y);
    boolean wounded();
    boolean doNotWounded();
    void isWin();
    void draw();
}
