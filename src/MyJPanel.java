import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class MyJPanel extends JPanel {

    static Random random = new Random();


    static ArrayList<Ball> balls = new ArrayList<>();

    public MyJPanel() {
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        for (Ball ball : balls) {
            g.fillOval(ball.x, ball.y, 40, 40);
        }
        repaint();
    }

    static void makeBall(int numberOfBalls) {

        for (int i = 0; i < numberOfBalls; i++) {
            Ball tempBall = new Ball(random.nextInt(459), random.nextInt(423));
            balls.add(tempBall);
        }

    }

    static void removeBall() {
        balls.remove(balls.size() - 1);
    }

    public void settingCoordinates() {

        for (Ball ball : balls) {
            if (ball.getX() > 459) {
                ball.setAdderX(-1);
            } else if (ball.getX() < 0) ball.setAdderX(1);

            if (ball.getY() > 423) {
                ball.setAdderY(-1);
            } else if (ball.getY() < 0) ball.setAdderY(1);

            ball.setX(ball.getX() + ball.getAdderX());
            ball.setY(ball.getY() + ball.getAdderY());
        }
    }

}
