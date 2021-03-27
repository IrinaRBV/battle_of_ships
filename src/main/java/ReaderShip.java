import java.util.Arrays;
import java.util.Scanner;

public class ReaderShip implements Reader {
    private String[] split;

    @Override
    public void read() {
        int x;
        int y;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 1; i++) {
            split = scanner.nextLine().split(";");
            System.out.println(Arrays.toString(split));
            System.out.println("Длина массива " + split.length);

        }
        for(int j = 0; j < split.length; j++) {
            String s = split[j];
            x = Integer.parseInt(s.substring(0,1));
            y = Integer.parseInt(s.substring(2,3));
            System.out.println("x = " + x + " y = " + y);
        }
    }

}
