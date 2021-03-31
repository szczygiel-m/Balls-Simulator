import javax.swing.*;
import java.awt.*;


public class Starter {

    public static int threadSleep = 10;

    public static int getThreadSleep() {
        return threadSleep;
    }

    public static void setThreadSleep(int threadSleep) {
        Starter.threadSleep = threadSleep;
    }

    public Starter() {
    }

    void start() {
        JFrame window = new JFrame();
        window.setVisible(true);
        window.setLayout(null);
        window.setTitle("Ball Simulator");
        window.setBounds(0, 0, 650, 500);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        MyJPanel panel = new MyJPanel();
        panel.setBounds(0, 0, 500, 500);
        panel.setVisible(true);
        window.add(panel);
        panel.setBackground(Color.MAGENTA);
        window.setVisible(true);
        window.setLayout(null);
        window.setResizable(false);

        MyJPanel buttonPanel = new MyJPanel();
        buttonPanel.setBounds(500, 0, 150, 500);
        buttonPanel.setBackground(Color.BLUE);


        JButton speedUp = new JButton("Speed Up");
        ActionListener speedUpListener = new ActionListener(speedUp);
        speedUp.addActionListener(speedUpListener);
        buttonPanel.add(speedUp);

        JButton slowDown = new JButton("Slow Down");
        ActionListener slowDownListener = new ActionListener(slowDown);
        slowDown.addActionListener(slowDownListener);
        buttonPanel.add(slowDown);

        JButton addBall = new JButton("Add Ball");
        ActionListener addBallListener = new ActionListener(addBall);
        addBall.addActionListener(addBallListener);
        buttonPanel.add(addBall);

        JButton removeBall = new JButton("Remove Ball");
        ActionListener removeBallListener = new ActionListener(removeBall);
        removeBall.addActionListener(removeBallListener);
        buttonPanel.add(removeBall);

        JButton pause = new JButton("Pause");
        ActionListener pauseListener = new ActionListener(pause);
        pause.addActionListener(pauseListener);
        buttonPanel.add(pause);

        JButton resume = new JButton("Resume");
        ActionListener resumeListener = new ActionListener(resume);
        resume.addActionListener(resumeListener);
        buttonPanel.add(resume);

        window.add(buttonPanel);

        MyJPanel.makeBall(15);

        while (true) {
            panel.repaint();
            try {
                Thread.sleep(threadSleep);
            } catch (Exception ignored) {
            }
            panel.settingCoordinates();
        }

    }
}
