import javax.sound.midi.Soundbank;

public class OddTest {
    public static void main(String[] args) {
        checkNumber(10);
        checkNumber(11);
        checkNumber(12);
        checkNumber(13);
    }

    private static void checkNumber(final int i) {
        String check = i % 2 == 0 ? "parzysta" : "nieparzysta";
        System.out.println(i + " " + check);
    }
}
