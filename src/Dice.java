import java.util.Random;

public class Dice {

    int upFace;

    public void roll() {
        Random random = new Random();
        upFace = random.nextInt(6) + 1;
    }

    public int getFace() {
        return upFace;
    }
}
