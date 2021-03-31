import java.util.Random;

public class Ball {
    int x;
    int y;

    int adderX;
    int adderY;

    Random random = new Random();

    public int getAdderX() {
        return adderX;
    }

    public void setAdderX(int adderX) {
        this.adderX = adderX;
    }

    public int getAdderY() {
        return adderY;
    }

    public void setAdderY(int adderY) {
        this.adderY = adderY;
    }

    public Ball(int x, int y){
        this.x=x;
        this.y=y;
        this.adderX = 1 - ((random.nextBoolean()) ? 2:0);
        this.adderY = 1 - ((random.nextBoolean()) ? 2:0);
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
